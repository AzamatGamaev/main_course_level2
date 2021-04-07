package lesson1;

public class Road extends Barriers {

    private final int distance;

    public Road(String name, int distance) {
        super(name);
        this.distance = distance;
    }

    public int getDistance() {
        return this.distance;
    }
}
