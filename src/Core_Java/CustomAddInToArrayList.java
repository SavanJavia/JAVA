package Core_Java;

import java.util.ArrayList;

/**
 * IF YOU NEED ANY SPECIFIC VALUE ADD IN LAST USING ARRAYLIST
 */
public class CustomAddInToArrayList {

    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        for(char i='a';i<='z';i++) {
            al.add(i);
        }

        ArrayList a1 = new ArrayList();
        ArrayList a2 = new ArrayList();
        ArrayList aFinal = new ArrayList();

        for(Object a : al) {
            if (!a.equals('o')) {
                a1.add(a);
            } else {
                a2.add(a);
            }
        }

        aFinal.addAll(a1);
        aFinal.addAll(a2);

        System.out.println(aFinal);
    }
}
