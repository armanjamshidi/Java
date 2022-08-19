package exclass7.Bill;

public class Data {

    // Singleton Pattern
    private static final Data data = new Data();
    private User[] users;

    private Data() {
        users = new User[]{new User("U1"), new User("U2"), new User("U3")};
    }

    public static Data getInstance() {
        return data;
    }

    public User[] getUsers() {
        return users;
    }

}
