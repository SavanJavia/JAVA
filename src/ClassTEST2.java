import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ClassTEST2 {



    public static void main(String[] args) {

        //ARRAYLIST: 15,10,24,12,98,64
        //OUTPUT: 64 - SECOND HIGHEST

        List<Integer> intArray = Arrays.asList(15,10,24,12,98,64);

        TreeSet<Integer> ts = new TreeSet<>(intArray);


        for(int i = 0;i<ts.size();i++){

            if(ts.size()-2==i){

                System.out.println(ts.toArray()[i]);
            }

        }


    }
}
