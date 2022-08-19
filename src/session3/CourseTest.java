
package session3;

import java.util.Scanner;

public class CourseTest {

    public static void main(String[] args) {

        String str ;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Name:");
        str = input.nextLine();

        Course myCourse = new Course();             //An instance of course    

        myCourse.setCourseName(str);

//        myCourse.courseName=str;

        myCourse.printCourse();
//        myCourse.courseName="C++";
        myCourse.setCourseName("C++");
        myCourse.printCourse();
        String name = myCourse.getCourseName();
        System.out.println("Name=" + name);
        //--------------------------------
        String str2 = " Programming";
        myCourse.setCourseName(myCourse.getCourseName() + str2);
        myCourse.printCourse();

        //--------------------------------
    }

}
