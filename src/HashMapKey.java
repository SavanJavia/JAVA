import java.util.HashMap;

public class HashMapKey {

    public static void main(String[] args) {

        HashMap<HashClassKey,HashClassKey> hs = new HashMap<>();
        hs.put(new HashClassKey("a","a"),new HashClassKey("a","a"));
        System.out.println(hs.hashCode());
        hs.put(new HashClassKey("a","a"),new HashClassKey("a","a"));
        System.out.println(hs.hashCode());

    }
}

class HashClassKey{
    public HashClassKey(String name, String address) {
        this.name = name;
        this.address = address;
    }

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
