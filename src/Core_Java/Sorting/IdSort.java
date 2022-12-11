package Core_Java.Sorting;

import java.util.Comparator;

public class IdSort implements Comparator<StudentDto> {
    @Override
    public int compare(StudentDto o1, StudentDto o2) {
        if(o1.getId()== o2.getId()){
            return 0;
        }else if(o1.getId()>o2.getId()){
            return 1;
        }else{
            return -1;
        }
    }
}
