package Core_Java;

public class ReverseClass {

    public static void main(String[] args) {

        String input = "This is String";
        //output : siht si gnirts


        String[] strArray = input.split(" ");

        StringBuffer sb;
        String str = "";

        for(int i=0;i<strArray.length;i++){
            sb = new StringBuffer();

            str = str +" "+ sb.append(strArray[i]).reverse();

        }

        System.out.println(str.trim());
    }
}
