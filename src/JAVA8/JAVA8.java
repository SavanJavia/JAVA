package JAVA8;

import java.util.*;
import java.util.stream.Collectors;

public class JAVA8 {
    public static void main(String[] args) {

        // Lowercase to Uppercase

       List<String> lst = Arrays.asList("a","b");

        List<String> lst8 = lst.stream().map(a -> a.toUpperCase()).collect(Collectors.toList());
        System.out.println(lst8);

        List<Employee> employees =
                Arrays.asList(
                        new Employee(true,1, "SAI", Arrays.asList("DATA ECONOMY"),1111111),
                        new Employee(true,1, "RAVI", Arrays.asList("HI TECH CITY"),11111112),
                        new Employee(true,2, "HARI", Arrays.asList("HYD"),11111113),
                        new Employee(true,3, "RAJ", Arrays.asList("INDIA"),11111114),
                        new Employee(true,2, "KUMAR", Arrays.asList("PUNE"),11111115),
                        new Employee(false,4, "MOHAN", Arrays.asList("US"),11111115));

        /* 1. display all the employees addresses*/
        List<String> strlist = employees.stream().flatMap(abc -> abc.getAddress().stream()).collect(Collectors.toList());
       System.out.println(strlist);

        /* 2. display employee name whose employee id's duplicate*/

        List<String> emp = employees.stream().collect(Collectors.groupingBy(Employee::getId)).entrySet().stream().
                filter(e -> e.getValue().size() > 1).flatMap(e -> e.getValue().stream().map(p -> p.getName())).collect(Collectors.toList());
        System.out.println(emp);

        ArrayList<String> l = new ArrayList<>();
        l.add("D");
        l.add("A");
        l.add("C");
        l.add("B");
        l.add("D");

       System.out.println(l.stream().filter(i -> Collections.frequency(l,i)>1).collect(Collectors.toList()));


        /*  3. Group the employee by active status*/
       System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::isActive,Collectors.toList())));


    }
}


class Employee{
    private Integer id;
    private String name;
    private boolean active;
    private int salary ;
    private List<String> address = new ArrayList<>();

    public Employee(boolean active, Integer id, String name, List<String> address, int salary ) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.active= active;
        this.salary=salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getAddress() {
        return address;
    }
    public void setAddress(List<String> address) {
        this.address = address;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  name;
    }
}



