package session30;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Student s1 = new Student("arman", 9943493);
        Student s2 = new Student("reza", 9954498);
        List<Student> students = new LinkedList<>();
        students.add(s1);
        students.add(s2);
        Map<String, List<Student>> map = new HashMap<>();
        map.put("java", students);
        University uni = new University(map);
        uni.addStudentCourse("java", new Student("ali", 23123));
        Student s3 = new Student("eliot", 10101001);
        uni.addStudentCourse("linux", s3);

        System.out.println(uni);
        uni.removeStudentCourse("linux", s3);
        System.out.println(uni);


    }
}
