package midterm99.TA;

public class University {
    private Student[] stdList;
    private int n;
    private int m;

    public University(int n) {
        this.n = n;
        this.m = 0;
        this.stdList = new Student[n];
    }

    public void addStudent(Student st) {
        if (m != n)
            stdList[m++] = st;
        else
            System.out.println("Class Full");
    }

    public void removeStudent(Student st) {
        int index = -1;

        for (int i = 0; i < stdList.length; i++)
            if (st.equals(stdList[i])) {
                index = i;
                break;
            }

        if (index == -1) {
            System.out.println("No such Student exist...");
            return;
        }

        Student[] newStdList = new Student[n];
        int counter = 0;

        for (int i = 0; i < m; i++)
            if (i == index)
                continue;
            else
                newStdList[counter++] = stdList[i];

        this.m--;
        stdList = newStdList;
    }

    public Student findStudent(String stdNo) {
        for (Student std : stdList)
            if (stdNo.equals(String.valueOf(std.getStdNumber())))
                return std;
        return null;
    }

    public Student[] findStudents(double avg) {
        Student[] newStdList = new Student[m];

        for (int i = 0; i < stdList.length; i++)
            if (stdList[i].getAvg() > avg)
                newStdList[i] = stdList[i];

        return newStdList;
    }

    public Student[] findStudents(String name) {
        Student[] newStdList = new Student[m];

        for (int i = 0; i < stdList.length; i++)
            if (stdList[i].getName().contains(name))
                newStdList[i] = stdList[i];

        return newStdList;
    }

    public void printAllStudent() {
        for (Student std : stdList)
            if (std != null)
                System.out.print(std);
    }
}
