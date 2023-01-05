package JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetNameByJAVA8 {

    public static void main(String[] args) {

        List<Employee8> lst = Arrays.asList(new Employee8("SAVAN","Gandhinagar"),
                new Employee8("SAVAN1","Rajkot"),
                new Employee8("SAVAN2","Gandhinagar"),
                new Employee8("SAVAN3","Pune"));

        List<String> allName1 = lst.stream().filter(a->a.getCity().equals("Gandhinagar")).map(a->a.getName()).collect(Collectors.toList());


        System.out.println(allName1);
    }
}

class Employee8{
    public Employee8(String name, String city) {
        this.name = name;
        this.city = city;
    }

    private String name;

    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
