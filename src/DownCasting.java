public class DownCasting {

    public static void main(String[] args) {

        Person p =  new Student();
        Student s = (Student) p; // Need to provide explicitly child class convert
        s.name();

    }
}


class Person{

    String name;
    int salary;

    Person(){

    }
    Person(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    public String name(){
        System.out.println("PERSON");
        return "PERSON";
    }

    @Override
    public String toString() {
        return "NAME:"+name;
    }
}

class Student extends Person {

    Student() {

    }
    Student(String name, int salary) {
        super(name, salary);
    }

    public String name(){
        System.out.println("STUDENT");
        return "STUDENT";
    }

}