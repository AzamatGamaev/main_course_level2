package lesson1;

public class Boat extends InanimateParticipants {

    public Boat(String name, int runDistance, int jumpHeight) {
        super(name, runDistance, jumpHeight);
    }

    public void slide() {
        System.out.println("Лодка скользит по воде.");
    }

    @Override
    public void swim() {
        System.out.println("Лодка плывёт.");
    }

}
