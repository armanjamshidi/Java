package exclass3;

public class Casting {
    public static void main(String[] args) {

        int a = 6;
        double b = 4.5;
        // cast double to int with (int)
        int c = (int) b;
        System.out.println(c);
        // !!
        System.out.println(a);
        double f = a;

        // cast double to float with (float) or ....f
        float f2 = (float) 12.3;
        float f1 = 12.3f;

        System.out.println(f1);
        System.out.println(f);

        String s1 = "123";

        //int d = (int) s1;  !!! wrong
        // The method generally used to convert String to Integer in Java is parseInt().
        int d = Integer.parseInt(s1);
        System.out.println(d * 2);

        System.out.println(s1);
        System.out.println(d);

        String ss = "a1a2";
        //ss = ss.replaceAll("[^0-9]", "");
        System.out.println(Integer.parseInt(ss));

    }

}
