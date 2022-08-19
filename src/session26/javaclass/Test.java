package session26.javaclass;


public class Test {

    public static void main(String[] args) {

        Person student = new Student("ali amini" , 1234);
        Person teacher = new Teacher("reza rahmani", "assistant professor");

//        System.out.println(student.toString());
//        System.out.println(teacher.toString());
//        student.getCourse();

        Person[] people = {student , teacher};
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].toString());

            if(people[i] instanceof Student){
                ((Student) people[i]).getCourse();
            }
        }

        //////////////////////


//        Circle circle = new Circle(5);
//        Square square = new Square(6);

        Shape circle = new Circle(5);
        Shape square = new Square(6);

        System.out.println(circle.calculateArea());
        System.out.println(square.calculateArea());

        Shape[] shapes = {circle,square};
        for (Shape s:shapes) {
            System.out.println(s.toString());
            System.out.println("calculatePrimiter: " + s.calculateprimiter());
            System.out.println("calculateArea: " + s.calculateArea());
        }



//        MyClass1 myClass1 = new MyClass1() {
//            @Override
//            public double calculatePrimiter() {
//                return 0;
//            }
//        }


    }

    }

