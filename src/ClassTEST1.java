import java.util.Arrays;

public class ClassTEST1 {

    public static void main(String[] args) {
        String input = "my name is savan javia";

        //javia savan is my name;

        String[] strArray = input.split(" ");

        String out = "";
        String s ="";
        for(int i=0;i<strArray.length;i++){

            s = strArray[i];
            out = s + out;
            s ="";

        }
        System.out.println(out);

       // String output = Arrays.stream(strArray).forEach(strArray.length);
    }
}
