public class SyncMethod {

    public static void main(String[] args) {

        SyncClass sc = new SyncClass();
        System.out.println(sc.getInstance());
    }
}

class SyncClass{

    public synchronized int getInstance(){

        return 1;
    }
}
