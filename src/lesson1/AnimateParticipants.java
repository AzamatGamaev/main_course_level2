package lesson1;

public class AnimateParticipants implements Running, Bouncing, Swimming {

    public String name;
    public int runDistance;
    public int jumpHeight;

    public AnimateParticipants(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return name;
    }

    @Override
    public void jump() {
        System.out.println(name + " может подпрыгнуть на " + this.getJumpHeight() + ".");
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }

    @Override
    public void run() {
        System.out.println(name + " может пробежать " + this.getRunDistance() + ".");
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public void swim() {
    }
}
