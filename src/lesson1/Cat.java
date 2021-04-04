package lesson1;

public class Cat implements Running, Swimming, Bouncing {

    private String name;
    private int runDistance;
    private int jumpHeight;

    public Cat(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void jump() {
        System.out.println("Кошка " + this.name + "может подпрыгнуть на " + this.getJumpHeight());
    }

    @Override
    public int getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Кошка " + this.name + "может пробежать " + this.getRunDistance());
    }

    @Override
    public int getRunDistance() {
        return getRunDistance();
    }

    @Override
    public void swim() {
        System.out.println("Кошка плывёт.");
    }
}
