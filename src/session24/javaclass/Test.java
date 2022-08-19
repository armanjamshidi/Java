package session24.javaclass;


public class Test {

    public static void main(String[] args) {

        //Calculation : Parent
        //MyCalculation1 : Child / parent
        //MyCalculation2 :child


        MyCalculation myCalculation =new MyCalculation(10,8,5);
        myCalculation.multiplication();


        ///////////////////////
        double[] grades = {18.5 , 18 , 19};
        Student student = new Student("ali amini" , "amini@yahoo.com", "st19825",grades);
        System.out.println(student);
        student.setEmail("ali@gmail.com");
        System.out.println(student);



    }

    }

