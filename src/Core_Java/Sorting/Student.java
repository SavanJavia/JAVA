package Core_Java.Sorting;

public class Student implements Comparable<Student>{

    private int id;
    private String name;
    private int rollNo;

    public Student(int id, String name, int rollNo) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        if(this.id == o.id){
            return 0;
        }
        else if(this.id>o.id){
            return 1;
        }//else if(o.id>this.id){
            return -1;
        //}
    }

}
