package exclass9;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private static final Data data = new Data();

    private final String[] FROM_TO_END = {"Tehran", "Esfahan", "Yazd", "Mashhad", "Shiraz", "Kerman"};
    private final String[] DAY = {"Saturday", "Sunday", "Monday", "Tuesday"};
    private final int[] TIME = {8, 10, 18, 20};

    private List<User> userList;
    private List<Flight> allFlights;
    private List<String> fromAndTo;
    private List<String> day;
    private List<String> time;

    public Data() {
        userList = new ArrayList<>();
        allFlights = new ArrayList<>();

        makeUsers();
        makeFromAndTo();
        makeDay();
        makeTime();
    }

    public static Data getInstance() {
        return data;
    }

    private void makeFromAndTo() {
        fromAndTo = new ArrayList<>();
        for (String s : FROM_TO_END)
            fromAndTo.add(s);
    }

    private void makeDay() {
        day = new ArrayList<>();
        for (String s : DAY)
            day.add(s);
    }

    private void makeTime() {
        time = new ArrayList<>();
        for (int n : TIME)
            time.add(String.valueOf(n));
    }

    private void makeUsers() {
        userList.add(new User("Moein", "1234"));
        userList.add(new User("Amir", "1111"));
        userList.add(new User("Negin", "2222"));
    }

    public void addUser(User user) {
        this.userList.add(user);
    }

    public List<User> getUserList() {
        return userList;
    }

    public List<Flight> getAllFlights() {
        return allFlights;
    }

    public void setAllFlights(List<Flight> allFlights) {
        this.allFlights = allFlights;
    }

    public List<String> getFromAndTo() {
        return fromAndTo;
    }

    public List<String> getDay() {
        return day;
    }

    public List<String> getTime() {
        return time;
    }

}
