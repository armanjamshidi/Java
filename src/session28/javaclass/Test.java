package session28.javaclass;

import java.util.*;

public class Test {
    public static void main(String[] args) {

//
//    String[] str =new String[10];
//
//    List<String> myList = new  ArrayList<>();
//    myList.add("salam");
//    myList.add("hi");
//    System.out.println(myList);
//    System.out.println(myList.get(1));


        Student student1 = new Student("ali amini",258);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(new Student("reza rahimi",369));
        students.add(new Student("mina mohseni",654));
        students.add(new Student("saeed sajedi",687));

        University university = new University(students);
        System.out.println(university);

        university.addStudent(new Student("rona abasi",247));
        System.out.println(university);



    }
}
