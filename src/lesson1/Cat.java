package lesson1;

public class Cat extends AnimateParticipants {

    public Cat(String name, int runDistance, int jumpHeight) {
        super(name, runDistance, jumpHeight);
    }

    @Override
    public void swim() {
        System.out.println("Кошка плывёт.");
    }
}
