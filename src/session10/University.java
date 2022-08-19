package session10;


public class University {
    private String uniID;
    private Student[] students;

//    public University(String uniID, Student[] students) {
//        this.uniID = uniID;
//        this.students = students;
//    }

    public University(int n) {

        this.students=new Student[n];

    }

    public String getUniID() {
        return uniID;
    }

    public void setUniID(String uniID) {
        this.uniID = uniID;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString(){
        String studentInfo = "";
        for (int i = 0; i < students.length; i++) {
            studentInfo += "student_"+i + "=>"+students[i].toString()+"\n";
        }
        return String.format("universityId: %s%nStudentsInfo:%n%s",uniID,studentInfo );
    }
}
