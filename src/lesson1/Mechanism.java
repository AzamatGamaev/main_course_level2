package lesson1;

public abstract class Mechanism {

    private final String name;

    public Mechanism(String name) {
        this.name = name;
    }

    public void sayYouName(){
        System.out.println(name);
    }
}
