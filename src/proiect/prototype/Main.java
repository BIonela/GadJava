package proiect.prototype;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Ana",25);
        System.out.println("Person 1: " + person);

        Person secondPerson = (Person) person.clone();
        System.out.println("Person copy: " + secondPerson);

        System.out.println(System.identityHashCode(person) + "\n" + System.identityHashCode(secondPerson));
    }
}
