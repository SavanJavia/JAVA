import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumLamda {

    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,3,5,6);

        System.out.println(lst.stream().reduce(0,(o, o2) -> o+o2));

        StudentABC s  = new StudentABC();
        s.setId(1);
        s.setName("Core_Java.Test");

        List<StudentABC>  studetnLst = new ArrayList<>();
        studetnLst.add(s);

        studetnLst.stream().map(a->a.name).forEach(System.out::println);




    }
}


class StudentABC{

    String name;
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}