package session11;

public class CourseTest {

    public static void main(String[] args) {

        double[] array = {15, 16, 20};
        Course myCourse1 = new Course("java", 12, array);

        System.out.printf("Average %s = %.2f\n", myCourse1.getCourseName(), myCourse1.average());

        System.out.printf("Average %s = %.2f\n", myCourse1.getCourseName(), myCourse1.average());
        mulCourseGrades(myCourse1, 1.1);  // 15*1.1, 16*1.1, 20*1.1
        System.out.printf("Average %s = %.2f\n", myCourse1.getCourseName(), myCourse1.average());
    }

    public static void mulCourseGrades(Course myCourse, double val) {
        double[] grades = myCourse.getGrades();
        for (int i = 0; i < grades.length; i++) {
            grades[i] *= val;
        }
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
