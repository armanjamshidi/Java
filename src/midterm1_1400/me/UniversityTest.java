package midterm1_1400.me;

import java.util.Arrays;
import java.util.Scanner;

public class UniversityTest {
    static public void main(String[] args) {
        Scanner in=new Scanner(System.in);
        University uni = new University(3);
        uni.addStudent(in);
        System.out.println("new student");
        uni.addStudent(in);
        uni.addStudent(in);
        System.out.println(uni);
        uni.SwapStudent(9943493,9933322);
        uni.sort();
        System.out.println(Arrays.toString(uni.getGrades(9943493)));
        System.out.println(uni);

    }
}

