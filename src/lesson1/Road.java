package lesson1;

public class Road extends Barriers {

    private int distance;

    public Road(String name, int distance) {
        super(name);

        this.distance = distance;
    }

    public int getLength() {
        return distance;
    }

    protected boolean running(Running running) {
        System.out.println("Дистанция " + super.getName() + " длина которой равна " + this.distance);

        running.run();

        if (getLength() <= running.getRunDistance()) {
            System.out.println("Дистанция пройдена!");
            return true;
        } else {
            System.out.println("Дистанция не пройдена.(");
            return false;
        }
    }
}
