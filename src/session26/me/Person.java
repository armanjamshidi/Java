package session26.me;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void personmethod() {
        System.out.println("person method");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
