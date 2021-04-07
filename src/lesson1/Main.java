package lesson1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Object[] participants = new Object[3];

        participants[0] = new Human("Женя", 10, 10);
        participants[1] = new Robot("Валли", 15, 15);
        participants[2] = new Cat("Том", 7, 12);

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


        for (Object participant : participants) {
            boolean result = true;
            for (Barriers barrier : barriers) {

                if (isWall(barrier)) {

                    int height = ((Wall) barrier).getHeight();
                    System.out.println(barrier.getName() + " с высотой " + height);

                    if (participant instanceof AnimateParticipants) {
                        result = ((AnimateParticipants) participant).jump(height);
                        if (!result) {
                            break;
                        }
                    }

                    if (participant instanceof InanimateParticipants) {
                        result = ((InanimateParticipants) participant).jump(height);
                        if (!result) {
                            break;
                        }
                    }
                }


                if (isRoad(barrier)) {

                    int distance = ((Road) barrier).getDistance();
                    System.out.println(barrier.getName() + " с длиной " + distance);

                    if (participant instanceof AnimateParticipants) {
                        result = ((AnimateParticipants) participant).run(distance);
                        if (!result) {
                            break;
                        }
                    }

                    if (participant instanceof InanimateParticipants) {
                        result = ((InanimateParticipants) participant).run(distance);
                        if (!result) {
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
