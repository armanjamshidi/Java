package session26.me;

public class Student extends Person{
    private int id;

    public Student(String name,int id) {
        super(name);
        this.id=id;
    }
public void getcourse()
{
    System.out.println("course process done");
}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
