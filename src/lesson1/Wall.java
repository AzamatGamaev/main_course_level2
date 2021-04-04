package lesson1;

public class Wall extends Barriers {

    private int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    protected boolean bounce(Bouncing bounce) {
        System.out.println("Стена " + super.getName() + " высота которой равна " + this.height);

        bounce.jump();

        if (getHeight() <= bounce.getJumpHeight()) {
            System.out.println("Стена перепрыгнута.");
            return true;
        } else {
            System.out.println("Стена не перепрыгнута.");
            return false;
        }
    }
}
