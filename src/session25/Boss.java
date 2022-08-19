package session25;

public class Boss extends Employee{

    private final double bossRate;
    
    public Boss(String firstName, String lastName, double baseSalary, 
            double bossRate) {
        super(firstName, lastName, baseSalary);
        this.bossRate=bossRate;
    }

    public double getBossRate() {
        return bossRate;
    }
    
    @Override
    public double earnings(){
        return bossRate*getBaseSalary();

    }
    public void printBoss(){
        System.out.println("Salam Boss");

    }

}
