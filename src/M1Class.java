import java.util.*;

public class M1Class {
    public static void main(String[] args) {
        EmployeeM e1 = new EmployeeM("Kamlesh", 1);
        EmployeeM e2 = new EmployeeM("Kamlesh", 1);
        CustomerM c1 = new CustomerM("Kamlesh", 1);
        CustomerM c2 = new CustomerM("Kamlesh", 1);
        Set s = new HashSet<>();
        s.add(e1);
        s.add(e2);
        s.add(c1);
        s.add(c2);

        System.out.println(s);
        System.out.println(s.size());
    }
}

class EmployeeM {
    String name;
    int id;
    int salary;

    public EmployeeM(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeM{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeM employeeM = (EmployeeM) o;
        return id == employeeM.id && salary == employeeM.salary && Objects.equals(name, employeeM.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, salary);
    }
}

class CustomerM{
    String name;
    int id;

    public CustomerM(String name, int id) {
        this.name = name;
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerM customerM = (CustomerM) o;
        return id == customerM.id && Objects.equals(name, customerM.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "CustomerM{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}


