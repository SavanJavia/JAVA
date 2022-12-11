import java.util.Arrays;

public class ClassTEST1 {

    public static void main(String[] args) {
        String input = "my name is savan javia";

        //javia savan is my name;

        String[] strArray = input.split(" ");

        String out = "";
        for(int i=strArray.length-1;i>=0;i--){
            out = out +" "+strArray[i];
        }
        System.out.println(out);
    }
}
