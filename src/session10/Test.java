package session10;

public class Test {
    public static void main(String[] args) {
        double array[] = {10, 15, 20, 16, 1, 8.5, 5};

        Student student1 = new Student("ali", 9911122, array);

        double array2[] = {10, 13, 13, 19};
        Student student2 = new Student("reza", 9922211, array2);
        System.out.println(student1);
        Student[] students = {student1, student2};
        University university = new University(students.length);
//University university=new University("a",students);
        university.setStudents(students);
        university.setUniID("Yazd");
        System.out.println(university);
    }
}
