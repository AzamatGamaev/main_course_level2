package lesson1;

public class Tank extends Mechanism implements Running, Swimming, Bouncing {

    public Tank(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Танк едет.");
    }

    @Override
    public void swim() {
        System.out.println("Танк плывёт.");
    }

    @Override
    public void jump() {
        System.out.println("Танк подлетел на трамплине.");
    }
}
