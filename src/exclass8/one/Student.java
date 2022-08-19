package exclass8.one;

public class Student {
    private String firstName;
    private String lastName;
    private int stdNumber;
    private double[] grades;

    public Student(String firstName, String lastName, int stdNumber, double[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stdNumber = stdNumber;
        this.grades = grades;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStdNumber() {
        return stdNumber;
    }

    public double[] getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return " firstName = " + firstName +
                ", lastName = " + lastName +
                ", stdNumber =" + stdNumber +
                ", grades = " + printGrades();
    }

    private String printGrades() {
        String str = "";
        for (double n : grades)
            str += (n + " ");
        return str;
    }

}
