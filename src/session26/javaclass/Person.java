package session26.javaclass;

public class Person { // parent
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void personMethod(){
        System.out.println("person method....");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
