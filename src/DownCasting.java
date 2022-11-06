public class DownCasting {

    public static void main(String[] args) {

        Person p =  new Student();
        Student s = (Student) p; // Need to provide explicitly child class convert
        s.name();

    }
}


class Person{

    public String name(){
        System.out.println("PERSON");
        return "PERSON";
    }
}

class Student extends Person {

    public String name(){
        System.out.println("STUDENT");
        return "STUDENT";
    }

}