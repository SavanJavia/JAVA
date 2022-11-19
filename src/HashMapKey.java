import java.util.HashMap;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashClassKey that = (HashClassKey) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
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
