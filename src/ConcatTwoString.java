public class ConcatTwoString {


    public static void main(String[] args) {
        String s1="abcd";
        String s2 = "1234";
//output = a1b2c3d4
//a1b2cd
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        String c1Sub;
        String c2Sub;

        String output ="";
        for(int i=0;i<c1.length;i++){
            c1Sub = String.valueOf(c1[i]) ;
            if(i<c2.length) {
                c2Sub = String.valueOf(c2[i]);
            }else{
                c2Sub="";
            }
            output = output + (c1Sub+c2Sub);
        }
        System.out.println(output);
    }
}
