package Core_Java;

public class ReverseClass {

    public static void main(String[] args) {

        String input = "This is String";
        //output : siht si gnirts


        String[] strArray = input.split(" ");

        StringBuffer sb;

        String out = "";
        for(int i=0;i<strArray.length;i++){

            char[] c = strArray[i].toCharArray();

            for(int j=c.length-1;j>=0;j--){
                out = out + c[j];
            }
            out = out+" ";
        }
        System.out.println(out);
    }
}
