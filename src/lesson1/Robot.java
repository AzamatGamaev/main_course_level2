package lesson1;

public class Robot extends InanimateParticipants {

    public Robot(String name, int runDistance, int jumpHeight) {
        super(name, runDistance, jumpHeight);
    }

    @Override
    public void swim() {
        System.out.println("Робот плывёт.");
    }
}
