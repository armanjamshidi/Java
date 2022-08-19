package session8;

public class User {
    private String ID;
    private String name;
    private String email;
    private char sex;
    private int age;

    public String getID() {
        return (ID);
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public User() {
        this.ID = "user2021";
    }

    public User(String ID) {
        this();
        this.ID += ID;
    }

    public void setUserinfo(String name, String email, char sex, int age) {
        this.name = name;
        this.email = email;
        this.sex = sex;
        this.age = age;

    }

    public void setUserinfo(String name) {
        this.name = name;
    }

    public void setUserinfo(String name, String email) {
        this.name = name;
        this.email = email;

    }

    public void setUserinfo(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }


    @Override
    public String toString() {
        return "User{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
//    @Override
//    public String toString(){
//        return String.format("userId: %s , name: %s , age: %d , email: %s , gender: %c" , id,name,age,email,gender);
