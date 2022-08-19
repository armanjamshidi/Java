package midterm99.me;

public class University {
    private int n;
    private int m=0;
    private Student[] students;

    public University(int n) {
        this.n = n;
      //  m = 0;
        students = new Student[n];
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student st) {
        if (m != n) {
            students[m++] = st;
        }
    }

    public void removeStudent(Student st) {
        Student[] newstudent = new Student[students.length - 1];
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (!st.equals(students[i])) {
                newstudent[index] = students[i];
                index++;
            }
        }
        students = newstudent;
    }


    public Student findStudent(String stdNo) {

        for (int i = 0; i < students.length; i++) {
            if (students[i].getStuNum().equals(stdNo))

                return students[i];


        }
        return null;

    }

    public Student[] findStudents(double avg) {

        Student[] aboveavg = new Student[m];

        for (int i = 0; i <students.length; i++) {

            if (students[i].average() > avg) {

                aboveavg[i] = students[i];


            }

        }

        return aboveavg;


    }

    public Student[] findStudents(String name) {
        Student[] studentname = new Student[m];
        int a=0;
        for (int i = 0; i<students.length; i++)
            if (students[i].getName().contains(name)) {
                studentname[a++] = students[i];
            }
        return studentname;
    }


    public void printAllStudent() {
        for (Student std : students)
            if (std != null)
                System.out.println(std);
    }
}
