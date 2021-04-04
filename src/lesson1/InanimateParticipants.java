package lesson1;

public class InanimateParticipants implements Running, Bouncing{

    public String name;
    public int runDistance;
    public int jumpHeight;

    public InanimateParticipants(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean jump(int height) {
        System.out.println(name + " может подпрыгнуть на " + this.getJumpHeight() + ".");
        if (height <= this.getJumpHeight()) {
            System.out.println(name + " перепрыгнул препядствие.");
            return true;
        } else {
            System.out.println(name + " не перепрыгнул препядствие.");
            return false;
        }
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }

    @Override
    public boolean run(int distance) {
        System.out.println(name + " может пробежать " + this.getRunDistance() + ".");
        if (distance <= this.getRunDistance()) {
            System.out.println(name + " пробежал эту дистанцию.");
            return true;
        } else {
            System.out.println(name + "не пробежал эту дистанцию.");
            return false;
        }
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }
}