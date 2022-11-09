import com.sun.xml.internal.ws.util.StringUtils;

import java.util.HashMap;

public class StringCal1 {

    //output: A3B2C3AB2


    public static void main(String[] args) {
        String s = "AAABBCCCABB";
        char[] c = s.toCharArray();
        String o ="";
        int i;


            for (i = 0; i < c.length-1; i++) {
                String out = "";
                int z = 1;
                try {
                for (int j = i; j >= i; j++) {
                    if (j < c.length && String.valueOf(c[j]).equals(String.valueOf(c[j + 1]))) {
                        out = String.valueOf(c[i]);
                    } else {
                        if (out == "") {
                            o = o + String.valueOf(c[i]);
                        } else {
                            o = o + out + z;
                        }
                        i = j;
                        break;
                    }
                    z = z + 1;
                }}catch (Exception e){
                    o = o + out + z;

                }


            }

            System.out.println(o);


    }
}
