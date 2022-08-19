package session23;

public class TestInheritance {

    public static void main(String[] args) {
        Employee em=new Employee("Ali", "Zakeri",2_000_000.0);
        EmployeeLevel1 em1=new EmployeeLevel1("Reza", "Rezaee", 2_000_000.0,
                2.0);

        System.out.println("Name="+em1.getFirstName());
        System.out.println("Earning="+em1.earnings());
        System.out.println(em1.getBaseSalary());


    }

}
