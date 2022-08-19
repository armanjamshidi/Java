package session26.me;

public class Test {
    public static void main(String[] args) {
//        Person Student = new Student("arman", 9943493);
//        Person Teacher = new Teacher("ostad", "assistant professor");
//
//        Person[] people = {Student, Teacher};
//        for (int i = 0; i < people.length; i++) {
//            System.out.println(people[i]);
//            if (people[i] instanceof Student) {
//                ((Student) people[i]).getcourse();
//            }
//
//        }
//--------------------------------------------------------------------------------------------------------

        Circle circle = new Circle(6);
        Square square = new Square(8);

        Shape []shapes= {circle,square};

        for (int i = 0; i <shapes.length ; i++) {

            System.out.println(shapes[i].CalculateArea());
            System.out.println(shapes[i].CalculatorPerimeter());
        if(shapes[i] instanceof Circle)
        {
            ((Circle) shapes[i]).circleMethod();
        }
        }
    }
}
