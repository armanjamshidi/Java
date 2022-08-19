package session23;

public class EmployeeLevel1 extends Employee {

    private double levelRate;

    public EmployeeLevel1(String firstName, String lastName,
                          double baseSalary, double levelRate) {
        super(firstName, lastName, baseSalary);
        this.levelRate = levelRate;
    }

    public void setLevelRate(double levelRate) {
        this.levelRate = levelRate;
    }

    public double getLevelRate() {
        return levelRate;
    }

    @Override
    public double getBaseSalary() {
        return 2 * baseSalary;


    }

    @Override
    public double earnings() {
        return levelRate * super.earnings();


    }

    public void hello() {
        System.out.println("hello employee level 1 ");
    }

}
