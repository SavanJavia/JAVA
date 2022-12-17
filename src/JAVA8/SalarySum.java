package JAVA8;

import java.util.ArrayList;
import java.util.List;

public class SalarySum {
    public static void main(String[] args) {

       List<Doctor> d = new ArrayList<>();
        d.add(new Doctor("D1",1000));
        d.add(new Doctor("D2",2000));
        d.add(new Doctor("C3",3000));
        d.add(new Doctor("D4",4000));

        System.out.println(d.stream().filter(a->a.getName().startsWith("D"))
                .map(a->a.getSalary()).reduce(0,(first,second)->first+second));
    }
}
class Doctor{
    public Doctor(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    String name;
    int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}