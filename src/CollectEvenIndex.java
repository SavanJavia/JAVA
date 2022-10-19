
import java.util.ArrayList;

public class CollectEvenIndex {

    public static void main(String[] args) {

        /*Print/collect number who are on even index from Arraylist with stream ->

        List 1 2 3 4 5 6 7 8 values
             0 1 2 3 4 5 6 7 index
        Output :- 1 3 5 7*/

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        ArrayList<Integer> outList = new ArrayList<>();
        System.out.println(list);
        list.stream().forEach(l -> {
          int index = list.indexOf(l);
          if(index%2==0){
             // System.out.println(list.get(index));
              outList.add(list.get(index));
          }
        });

        System.out.println(outList);
    }
}
