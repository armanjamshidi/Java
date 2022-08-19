package midterm99.TA;

public class UniversityTest {
    public static void main(String[] args) {
        University university = new University(5);

        double[] g1 = {19, 15, 17.5};
        double[] g2 = {20, 20, 20};
        double[] g3 = {13, 15, 11};
        double[] g4 = {0, 5, 10};
        double[] g5 = {12.25, 15, 17.5};
        double[] g6 = {20, 20, 18};

        Student s1 = new Student("Moein", "Shishebor", 9834043, g1);
        Student s2 = new Student("Ali", "Namazi", 9831231, g2);
        Student s3 = new Student("Mohammad Ali", "Rezae", 9834432, g3);
        Student s4 = new Student("Maryam", "khodaBakhsh", 9830089, g4);
        Student s5 = new Student("Hasti", "Jafary", 9832308, g5);
        Student s6 = new Student("Mehdi", "Akbari", 9824609, g6);

        university.addStudent(s1);
        university.addStudent(s2);
        university.addStudent(s3);
        university.addStudent(s4);
        university.addStudent(s5);
        university.addStudent(s6);
        System.out.println("-----------------------------------");

        university.printAllStudent();
        System.out.println("-----------------------------------");

        System.out.print(university.findStudent("9832308").toString());
        System.out.print(university.findStudent("9834043").toString());
        System.out.println("-----------------------------------");

        for (Student std : university.findStudents(15))
            if (std != null)
                System.out.print(std);
        System.out.println("-----------------------------------");

        for (Student std : university.findStudents("Ali"))
            if (std != null)
                System.out.print(std);
        System.out.print("-----------------------------------");

        university.removeStudent(s1);
        System.out.println("\n-----------------------------------");

        university.printAllStudent();
        System.out.println("\n-----------------------------------");

        university.removeStudent(s5);
        System.out.println("-----------------------------------");

        university.printAllStudent();
        System.out.println("\n-----------------------------------");

        university.addStudent(s6);
        university.printAllStudent();
        System.out.println("\n-----------------------------------");

    }
}
