package exclass1;

public class TestSingIn {
    public static void main(String[] args) {
        SingIn sing = new SingIn("aaa@gmail.com");
        sing.setEmail("bbb@gmail.com");
        sing.setPhoneNumber(12345);
        System.out.println("- - - - - - ");
//        sing.show();
        System.out.println(sing);
    }
}
