package lesson1;

public class Human extends AnimateParticipants {

    public Human(String name, int runDistance, int jumpHeight) {
        super(name, runDistance, jumpHeight);
    }

    @Override
    public void swim() {
        System.out.println("Человек плывёт.");
    }
}
