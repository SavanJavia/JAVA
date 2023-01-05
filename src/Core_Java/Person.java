package Core_Java;

public class Person {

    public String name;
    int salary;

    Person() {

    }

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String name() {
        System.out.println("PERSON");
        return "PERSON";
    }

    @Override
    public String toString() {
        return "NAME:" + name;
    }
}
