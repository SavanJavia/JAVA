package Core_Java.Sorting;

import java.util.Comparator;

public class NameSort implements Comparator<StudentDto> {
    @Override
    public int compare(StudentDto o1, StudentDto o2) {
       return o2.getName().compareTo(o1.getName());//DEC
        //return o1.getName().compareTo(o2.getName());//ASC
    }
}
