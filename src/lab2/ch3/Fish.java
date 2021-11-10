package lab2.ch3;

public class Fish extends Animal {

    public Fish() {
        super(0);
    }


    @Override
    void eat() {
        System.out.println(getClass().getSimpleName() + " can eat.");
    }

    @Override
    public void walk(String message) {
        super.walk(message);
    }
}
