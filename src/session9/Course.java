package session9;

public class Course {

    private String courseName;
    private int courseId;
    private double[] grades;


    public Course(String courseName, int courseId, double[] grades) {

        this.courseName = courseName;
        this.courseId=courseId;
        this.grades=grades;

    }
    public double[] getGrades(){

        return grades;
    }
    public void setGrades(double[] grades){
        this.grades=grades;

    }
    public Course(String courseName) {

        this.courseName = courseName;


    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }



    public void setCourseName(String courseName) {
        this.courseName = courseName;

    }

    public String getCourseName() {
        return courseName;

    }

    public void printCourse() {
        System.out.printf("Welcome to %s\n",courseName);

    }
    public double average(){
        double sum=0;
        for (int i = 0; i < grades.length; i++) {
            sum+=grades[i];

        }

        return sum/grades.length;
    }
}

