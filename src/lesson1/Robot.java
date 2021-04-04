package lesson1;

public class Robot implements Running, Swimming, Bouncing {

    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void jump() {
        System.out.println("Робот " + this.name + "может подпрыгнуть на " + this.getJumpHeight());
    }

    @Override
    public int getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Робот " + this.name + "может пробежать " + this.getRunDistance());
    }

    @Override
    public int getRunDistance() {
        return getRunDistance();
    }

    @Override
    public void swim() {
        System.out.println("Робот плывёт.");
    }
}
