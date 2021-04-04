package lesson1;

public class Car extends InanimateParticipants {

    public Car(String name, int runDistance, int jumpHeight) {
        super(name, runDistance, jumpHeight);
    }

    public void start(){
        System.out.println("Двигатель заведён.");
    }
}
