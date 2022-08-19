package session25;

public abstract class Employee {
    private String firstName;
    private String lastName;
    protected double baseSalary;

    public Employee(String firstName, String lastName, double baseSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double earnings();

}
