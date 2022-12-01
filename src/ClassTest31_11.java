public class ClassTest31_11 {

    public static void main(String[] args) throws Exception {


        /*for(int i=0;i<100;i++){
            List<String> str = new ArrayList<>();

            if(i==50){

                //EXCEPTION
            }
        }*/

       // ClassTest123 o = new ClassTest123();
       // o.getInstaceMethod();//50

        ClassTest123.getInstaceMethod();
    }
}

class ClassTest123{


    private ClassTest123() {
    }

    static ClassTest123 obj;
    static int count=0;

    public static ClassTest123 getInstaceMethod() throws Exception {

        if(ClassTest123.count==50){
            throw new Exception();
        }

        //if(obj == null){
            obj = new ClassTest123();
            count++;
       // }

        return obj;
    }

    public int count(){

        return count;
    }

}

//class
//class -> 50 object --neg: exception

