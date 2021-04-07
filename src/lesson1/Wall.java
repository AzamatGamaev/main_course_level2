package lesson1;

public class Wall extends Barriers {

    private final int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }
}
