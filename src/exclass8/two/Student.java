package exclass8.two;

public class Student {
    private String firstName;
    private String lastName;
    private int stdNumber;
    private double[] grades;
    private double avg;

    public Student(String firstName, String lastName, int stdNumber, double[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stdNumber = stdNumber;
        this.grades = grades;
        avgCal();
    }

    public void avgCal() {
        double sum = 0;
        for (double d : grades)
            sum += d;
        this.avg = sum / grades.length;
    }

    public int getStdNumber() {
        return stdNumber;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double getAvg() {
        return avg;
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
