package session24.me;

public class Test2 {
    public static void main(String[] args) {
        double[] grades = {19, 17, 18};
        Student student = new Student("arman", "arman@gmail.com", 9943493, grades);
        System.out.println(student);
        System.out.println("__".repeat(50));
        student.changeEmail("arman123@gmail.com");
        System.out.println(student);
        System.out.println("__".repeat(50));
        student.setEmail("arman@yahoo.com");
        System.out.println(student);


    }
}
