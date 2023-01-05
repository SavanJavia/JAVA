package Core_Java;

import java.util.Objects;

public class HashCode_Equal {
    public static void main(String[] args) {

        xyz x = new xyz();
        x.setId("1");
        System.out.println(x.hashCode());
        xyz x1 = new xyz();
        x1.setId("1");
        System.out.println(x1.hashCode());
        System.out.println(x.equals(x1));


    }
}


class xyz{

    String name;

    String id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        xyz xyz = (xyz) o;
        return Objects.equals(name, xyz.name) && Objects.equals(id, xyz.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
