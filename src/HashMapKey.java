import java.util.HashMap;
import java.util.Objects;

public class HashMapKey {

    public static void main(String[] args) {

        HashMap<HashClassKey,String> hs = new HashMap<>();
        hs.put(new HashClassKey("a"),"ABC");
       // System.out.println(hs.hashCode());
        hs.put(new HashClassKey("a"),"XYZ");
       // System.out.println(hs.hashCode());

        System.out.println(hs);



    }
}

class HashClassKey{

    private String name;

    public HashClassKey(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashClassKey that = (HashClassKey) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "HashClassKey{" +
                "name='" + name + '\'' +
                '}';
    }
}
