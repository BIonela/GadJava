package lab2.ch3;

public class Cat extends Animal implements Pet{
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this(" ");
    }


    @Override
    void eat() {
        System.out.println(getClass().getSimpleName() + " is eating");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(this.name + " is playing");

    }
}
