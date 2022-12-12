package Core_Java.Sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Sorting {
    public static void main(String[] args) {


        List<StudentDto> studentList = new ArrayList<>();
        studentList.add(new StudentDto(1,"B",2));
        studentList.add(new StudentDto(3,"D",1));
        studentList.add(new StudentDto(4,"C",2));
        studentList.add(new StudentDto(1,"A",4));
        studentList.add(new StudentDto(1,"B",2));

        Comparator<StudentDto> compare = Comparator
                .comparing(StudentDto::getId)
                .thenComparing(StudentDto::getName)
                .thenComparing(StudentDto::getRollNo);

        System.out.println(studentList.stream().sorted(compare).collect(Collectors.toList()));

    }
}
