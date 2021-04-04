package lesson1;

public class Car extends Mechanism implements Running {

    public Car(String name) {
        super(name);
    }

    public void start(){
        System.out.println("Двигатель заведён.");
    }

    @Override
    public void run() {
        System.out.println("Машина едет.");
    }
}
