package exclass8.two;

public class UniversityTest {
    public static void main(String[] args) {
        University university = new University(5);

        double[] grades1 = {20, 18, 16};
        double[] grades2 = {19.5, 8};
        double[] grades3 = {12, 14.5, 16, 19};
        double[] grades4 = {8, 10.5, 13.32};

        university.addStudent(9912345, "alireza", "mohammadi", grades1);
        university.addStudent(9923456, "hesam", "ahmadian", grades2);
        university.addStudent(9934567, "ali", "nemati", grades3);
        university.addStudent(9945678, "neda", "ahmadi", grades4);

        System.out.println("All Students : ");
        System.out.println(university);

        System.out.println("Swap Student 1 & 3 : ");
        university.swapStudent(university.getStudent(0), university.getStudent(2));
        System.out.println(university);

        double[] newGrades = {18, 17, 15, 14.5, 14.43};
        System.out.println("Past Grades Of Student 4 : ");
        System.out.println(university.getStudent(3));
        university.setGrades(university.getStudent(3).getStdNumber(), newGrades);
        System.out.println("New Grades Of Student 4 : ");
        System.out.println(university.getStudent(3) + "\n");

        System.out.println("Before Sort : ");
        System.out.println(university);

        university.sortStdAve();

        System.out.println("After Sort : ");
        System.out.println(university);
    }
}
