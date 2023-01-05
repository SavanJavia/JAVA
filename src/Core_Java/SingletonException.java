package Core_Java;

public class SingletonException {

    public static void main(String[] args) throws Exception {


        /*for(int i=0;i<100;i++){
            List<String> str = new ArrayList<>();

            if(i==50){

                //EXCEPTION
            }
        }*/

       // Core_Java.ClassTest123 o = new Core_Java.ClassTest123();
       // o.getInstaceMethod();//50

        SingletonClass.getInstaceMethod();
    }
}

class SingletonClass{


    private SingletonClass() {
    }

    static SingletonClass obj;
    static int count=0;

    public static SingletonClass getInstaceMethod() throws Exception {

        if(SingletonClass.count==50){
            throw new Exception();
        }

        //if(obj == null){
            obj = new SingletonClass();
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

