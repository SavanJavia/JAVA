package Core_Java;

public class SwitchCase {
    public static void main(String[] args) {
        int x = 353;
        int j = x++;
        switch (j) {

            case 317: System.out.println("317 "+j+" "+x);
            case 353: System.out.println("353 "+j+" "+x);
            case 367:
                System.out.println("Is a prime number."+j+" "+x);
            //case 353: // duplicate lable error
            case 363:
                System.out.println("Is a palindrome."+j+" "+x);
            break;
            case 364:
                System.out.println("364."+j+" "+x);
            default:
                System.out.println("Invalid value."+j+" "+x);


        }
    }
}
