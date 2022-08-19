package session23;



public class Boss extends EmployeeLevel1{
    
    private double bossRate;
    
    public Boss(String firstName, String lastName, double baseSalary, 
            double levelRate,double bossRate) {
        super(firstName, lastName, baseSalary, levelRate);
        this.bossRate=bossRate;
    }

    public double getBossRate() {
        return bossRate;
    }

    @Override
    public double earnings(){
        return bossRate*super.earnings();
        
        
        
    }
    
    
}
