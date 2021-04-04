package lesson1;

public class Tank extends InanimateParticipants {

    public Tank(String name, int runDistance, int jumpHeight) {
        super(name, runDistance, jumpHeight);
    }

    @Override
    public void swim() {
        System.out.println("Срочное погружение");
    }
}
