package exclass1;

public class SingIn {
    private String email = "@gmail.com";
    private int phoneNumber;

    public SingIn() {
    }

    public SingIn(String email) {
        this.email = email;
    }

    public SingIn(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SingIn(String email, int phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.printf("past email :%s\n", this.email);
        this.email = email;
        System.out.printf("new email :%s\n", this.email);
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // func like toString
/*    public void show(){
        System.out.println("Email : "+this.email + "\nNumber : "+this.phoneNumber + "\n");
    }*/

    @Override
    public String toString() {
        return "Email : " + this.email + "\nNumber : " + this.phoneNumber + "\n";
    }
}
