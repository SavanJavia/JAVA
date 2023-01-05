package Core_Java;

import com.sun.corba.se.impl.orbutil.ObjectUtility;
import com.sun.xml.internal.ws.util.StringUtils;

import java.io.PrintStream;

public class OverLoadingClass {

    public static void main(String[] args) {

        //Real Time Example Of Overloading in JAVA
        //SYSTEM CLASS --> OUT IS OBJECT OF PRINTSTREAM CLASS AND PRINTLN IS BELONGS FROM PRINTSTREAM CLASS
        System.out.println();
        System.out.println(1);
        System.out.println("1");
    }
}


class Test{

    /**
     *  Compiler time exception due to
     * 'method(int, int)' clashes with 'method(int, int)'; both methods have same erasure
     */ //UNCOMMENT METHOD
    /*public void method(int a,int b){
        System.out.println(a+"<void method with 3 parameter>"+b);
    }*/

    public int method(int a,int b){
        System.out.println(a+"<int method with 2 parameter>"+b);
        return 1;
    }

    public int method(int a,int b,int c){
        System.out.println(a+"<int method with 3 parameter>"+b);
        return 1;
    }
}