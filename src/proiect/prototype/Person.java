package proiect.prototype;

public class Person implements Animal{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Animal clone() {
        return new Person(name,age);
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}
