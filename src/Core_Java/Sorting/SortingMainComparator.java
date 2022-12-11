package Core_Java.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingMainComparator {

    public static void main(String[] args) {
        List<StudentDto> studentList = new ArrayList<>();
        studentList.add(new StudentDto(1,"B",2));
        studentList.add(new StudentDto(3,"D",1));
        studentList.add(new StudentDto(4,"C",3));
        studentList.add(new StudentDto(2,"A",4));

        System.out.println(studentList);
        Collections.sort(studentList,new RollNo());
        System.out.println(studentList);

        Collections.sort(studentList,new IdSort());
        System.out.println(studentList);

        Collections.sort(studentList,new NameSort());
        System.out.println(studentList);
    }
}
