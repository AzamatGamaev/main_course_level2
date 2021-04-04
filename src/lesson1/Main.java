package lesson1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Object[] participants = new Object[3];

        participants[0] = new Human("Женя", 10, 10);
        participants[1] = new Robot("Валли", 15, 15);
        participants[2] = new Cat("Том", 7, 10);

        Barriers[] barriers = new Barriers[6];

        boolean whatBarrier;
        for (int i = 0; i < barriers.length; i++) {
            int distance = random.nextInt(10);
            whatBarrier = random.nextBoolean();
            if (whatBarrier) {
                barriers[i] = new Road("Road " + i, distance);
            } else {
                barriers[i] = new Wall("Wall " + i, distance);
            }
        }


        for (int i = 0; i < participants.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {

                if (isWall(barriers[j])) {

                    int height = ((Wall) barriers[j]).getHeight();
                    System.out.println(((Wall) barriers[j]).getName() + " с высотой " + height);

                    if (participants[i] instanceof AnimateParticipants) {
                        if (((AnimateParticipants) participants[i]).getJumpHeight() >= height) {
                            System.out.println((((AnimateParticipants) participants[i]).getName()) + " перепрыгнул это препядтсиве.");
                            result = true;
                        } else {
                            System.out.println((((AnimateParticipants) participants[i]).getName()) + " не перепрыгнул это препядтсиве.");
                            result = false;
                            break;
                        }
                    }

                    if (participants[i] instanceof InanimateParticipants) {
                        if (((InanimateParticipants) participants[i]).getJumpHeight() >= height) {
                            System.out.println((((InanimateParticipants) participants[i]).getName()) + " перепрыгнул это препядтсиве.");
                            result = true;
                        } else {
                            System.out.println((((InanimateParticipants) participants[i]).getName()) + " не перепрыгнул это препядстаие.");
                            result = false;
                            break;
                        }
                    }
                }


                if (isRoad(barriers[j])) {

                    int distance = ((Road) barriers[j]).getDistance();
                    System.out.println(((Road) barriers[j]).getName() + " с длиной " + distance);

                    if (participants[i] instanceof AnimateParticipants) {
                        if (((AnimateParticipants) participants[i]).getRunDistance() >= distance) {
                            System.out.println((((AnimateParticipants) participants[i]).getName()) + " пробежал эту дистанцию.");
                            result = true;
                        } else {
                            System.out.println((((AnimateParticipants) participants[i]).getName()) + " не пробежал эту дистанцию.");
                            result = false;
                            break;
                        }
                    }

                    if (participants[i] instanceof InanimateParticipants) {
                        if (((InanimateParticipants) participants[i]).getRunDistance() >= distance) {
                            System.out.println((((InanimateParticipants) participants[i]).getName()) + " пробежал эту дистанцию.");
                            result = true;
                        } else {
                            System.out.println((((InanimateParticipants) participants[i]).getName()) + " не пробежал эту дистанцию.");
                            result = false;
                            break;
                        }
                    }
                }
            }
            if (result) {
                System.out.println("Финишировал!");
            } else {
                System.out.println("Не финишировал!");
            }
            System.out.println();
        }
    }

    private static boolean isWall(Barriers barrier) {
        return barrier instanceof Wall;
    }

    private static boolean isRoad(Barriers barrier) {
        return barrier instanceof Road;
    }

}
