package exclass9;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<Flight> flightList;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.flightList = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flightList.add(flight);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    @Override
    public String toString() {
        return "\t\tWelcome " + this.username;
    }
}
