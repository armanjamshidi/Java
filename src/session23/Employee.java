package session23;

public class Employee {
    private String firstName;
    private String lastName;
    protected double baseSalary;

    public Employee(String firstName, String lastName, double baseSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBaseSalary(double baseSalary) {
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

    public double earnings() {

        return getBaseSalary() + 1_000_000.0;
    }

}
