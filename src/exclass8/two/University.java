package exclass8.two;

public class University {
    private int n;
    private int m;
    private Student[] students;

    public University(int n) {
        this.n = n;
        this.m = 0;
        students = new Student[n];
    }

    public void addStudent(int stdNo, String name, String family, double[] grades) {
        if (n == m + 1) {
            System.out.println("Class is full , cannot add anymore...");
            return;
        }
        students[m++] = new Student(name, family, stdNo, grades);
    }

    public void swapStudent(Student st1, Student st2) {
        int stdOneIndex = findStuIndex(st1.getStdNumber());
        int stdTwoIndex = findStuIndex(st2.getStdNumber());

        if (stdOneIndex == -1 || stdTwoIndex == -1) {
            System.out.println("No Such Student...!");
            return;
        }

        Student temp = students[stdOneIndex];
        students[stdOneIndex] = students[stdTwoIndex];
        students[stdTwoIndex] = temp;
    }

    public void setGrades(int stdNo, double[] grades) {
        int stdIndex = findStuIndex(stdNo);
        students[stdIndex].setGrades(grades);
        students[stdIndex].avgCal();
    }

    public void sortStdAve() {
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (comparison(i, j))
                    swapStudent(students[i], students[j]);
            }
        }
    }

    private boolean comparison(int first, int second) {
        if (students[second].getAvg() > students[first].getAvg())
            return true;
        return false;
    }

    private int findStuIndex(int stdNumber) {
        for (int i = 0; i < m; i++)
            if (students[i].getStdNumber() == stdNumber)
                return i;
        return -1;
    }


    public Student getStudent(int index) {
        return students[index];
    }

    @Override
    public String toString() {
        String str = "";

        for (int i = 0; i < m; i++)
            str += (students[i] + "\n");

        return str;
    }

}
