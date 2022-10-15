/**
 * Compiler time exception due to Exception 'java.lang.ArithmeticException' has already been caught
 * @return
 */
public class TryMultipleCatchFinally {

    public static void main(String[] args) {
       String str = callSubMethod();
       System.out.println(str);
    }


    private static String callSubMethod() {

        try{
            //Negative Scenario:
            int i = 1/0;
            return "t";
        }
        catch(Exception e){

            return "e";
        }
        catch(ArithmeticException ae){

            return "ae";
        }
        finally{

            return "f";
        }
        //return "main"; // Not Worked - Compiler Time Error
    }
}
