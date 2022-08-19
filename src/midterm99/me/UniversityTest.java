package midterm99.me;

import java.util.Arrays;

public class UniversityTest {
    static public void main(String[] args) {
        int[] grades1 = {20, 20, 17, 16};
        int[] grades2 = {20, 17, 16, 19};
        Student student = new Student("arman", "jamshidi", "9943493", grades1);
        Student student1 = new Student("arash", "jamshidi", "9922333", grades2);

        System.out.println(student.average());
        University uni = new University(1);
        uni.addStudent(student);
        uni.addStudent(student1);

        // uni.printAllStudent();

        System.out.println(Arrays.toString(uni.findStudents(17)));
        System.out.println("------------------------------");
        //    System.out.println(uni.findStudent("9943493"));
        uni.printAllStudent();


    }
}
