package session25;

public class EmployeeLevel1 extends Employee {
    private double levelRate;

    public EmployeeLevel1(String firstName, String lastName,
                          double baseSalary, double levelRate) {
        super(firstName, lastName, baseSalary);
        this.levelRate = levelRate;
    }

    @Override
    public double getBaseSalary() {
        return 2 * super.getBaseSalary();
    }

    @Override
    public double earnings() {
        return levelRate * getBaseSalary();
    }

}
