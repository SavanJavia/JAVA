package Core_Java;

public class TryCatchFinally {

    public static void main(String[] args) {
       String str = callSubMethod();
       System.out.println(str);
    }

    /**
     * In Both Case It's Printed Finally Block Return Statement
     * @return
     */
    private static String callSubMethod() {

        try{
            //Negative Scenario:
            int i = 1/0;
            return "t";
        }
        catch(Exception e){

            return "c";
        }
        finally{

            return "f";
        }
        //return "main"; // Not Worked - Compiler Time Error
    }
}
