package Core_Java.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingMainComparable{

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"first",2));
        studentList.add(new Student(3,"third",1));
        studentList.add(new Student(4,"forth",3));
        studentList.add(new Student(2,"second",4));

        System.out.println(studentList);
        Collections.sort(studentList);
        System.out.println(studentList);

    }


}
