public class StarPattern {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            String k="";
            for(int j=i;j>=1;j--){
                k= k +"*";
            }
            System.out.println(k);
        }
        for(int a=1;a<=5;a++){
            String l="";
            for(int j=1; j<=a;j++){
                l=l+"*";
            }
            System.out.println(l);
        }
    }
}
