package session25;

public class TestPoly {
    public static void main(String[] args) {
        EmployeeLevel1 em1 = new EmployeeLevel1("Reza", "Rezaee", 1_000_000.0, 2.0);
        Boss bs = new Boss("Ali", "Zakeri", 1_000_000.0,
                4.0);

        Employee[] array = new Employee[2];
        array[0] = em1;
        array[1] = bs;
        printPoly(array);
    }

    public static void printPoly(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s %f\n", array[i].getFirstName(),
                    array[i].earnings());
            if (array[i] instanceof Boss) {
//                Boss bs = (Boss) array[i];
                ((Boss) array[i]).printBoss();
            }
        }
    }

    public static void print(Employee em) {
        System.out.printf("%s %s %f\n", em.getFirstName(),
                em.getLastName(), em.earnings());
    }

}
