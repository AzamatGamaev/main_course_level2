package lesson1;

public class Boat extends Mechanism implements Swimming {
    public Boat(String name) {
        super(name);
    }

    public void slide() {
        System.out.println("Лодка скользит по воде.");
    }

    @Override
    public void swim() {
        System.out.println("Лодка плывёт.");
    }
}
