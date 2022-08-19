package session7;

public class CourseTest {

    public static void main(String args[]) {

        Course myCourse1 = new Course("Java");             //An instance of course    
        Course myCourse2 = new Course("C++");

        changeCourseName(myCourse1, myCourse2);
        myCourse1.printCourse();
        myCourse2.printCourse();

        System.out.println("-".repeat(40));

        Course temp = myCourse1;
        myCourse1 = myCourse2;
        myCourse2 = temp;

        System.out.println(myCourse2.getCourseName());
        myCourse1.printCourse();

    }

    public static void changeCourseName(Course c1, Course c2) {
        String temp = c1.getCourseName();
        c1.setCourseName(c2.getCourseName());
        c2.setCourseName(temp);

    }

    public static boolean checkCourseNameValidity(Course c1) {

        if (c1.getCourseName().length() < 50) {
            return true;
        } else {
            return false;
        }

    }

}
