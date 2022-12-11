package Core_Java.Sorting;

import java.util.Comparator;

public class RollNo implements Comparator<StudentDto> {
    @Override
    public int compare(StudentDto o1, StudentDto o2) {

        if(o1.getRollNo()== o2.getRollNo()){
            return 0;
        }else if(o1.getRollNo()>o2.getRollNo()){
            return 1;
        }else{
            return -1;
        }

    }
}
