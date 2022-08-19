package session9;

public class ArrayTest {

    public static void main(String[] args) {
        int[] c;//=new int [12];
        c = new int[12];
        c[0] = 10;
        c[1] = 11;
        for (int i = 0; i < c.length; i++) {
            c[i] += i;
            System.out.printf("c[%d]=%d\n", i, c[i]);

        }

        String b[] = new String[10];
        b[0] = "Java";
        b[1] = "C++ programming";
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        Course[] array = new Course[10];

        double[] grades1 = {15.0, 16.0, 20.0};
        double[] grades2 = {15.0, 18.0, 19.0};

        Course temp = new Course("java", 12, grades1);
        array[0] = temp;
        array[1] = new Course("C++", 13, grades2);

        System.out.println("Print Course array:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[i].printCourse();
                System.out.println("Average=" + array[i].average());

//                System.out.println(array[i].getCourseId());
            }
        }
    }

    public Course[] removeElement(Course[] array, int i) {
//            array[i]=null;
        Course[] newArray = new Course[array.length - 1];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (j != i) {
                newArray[index] = array[j];
                index++;
            }
        }
        return newArray;
    }
}
