package exclass9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Others {
    public void firstMenu() {
        Scanner in = new Scanner(System.in);

        System.out.println("\n  1. login\n  2. register\n  3. Exit\n\n");

        try {
            switch (in.nextInt()) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    System.out.println("Program Finished");
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong input\n");
                    firstMenu();
            }
        } catch (InputMismatchException ime) {
            System.out.println("your entry is not valid , choose a number between 1 to 3\n");
            firstMenu();
        }

    }

    private void register() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter username : ");
        String username = in.next();

        if (username.equals("-1"))
            firstMenu();

        System.out.println("Enter password : ");
        String password = in.next();

        System.out.println("register completed :)");
        userPanel(makeNewUser(username, password));
    }

    private void login() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter username : ");
        String username = in.next();

        if (username.equals("-1"))
            firstMenu();

        System.out.println("Enter password : ");
        String password = in.next();

        checkUserForLogin(username, password);
    }

    private User makeNewUser(String username, String password) {
        checkNotExistingUsername(username);

        User user = new User(username, password);
        Data.getInstance().addUser(user);

        return user;
    }

    private void checkNotExistingUsername(String username) {
        for (User user : Data.getInstance().getUserList())
            if (user.getUsername().equals(username)) {
                System.out.println(" This username is already token ...");
                register();
            }
    }

    private void checkUserForLogin(String username, String password) {
        for (User user : Data.getInstance().getUserList())
            if (user.getUsername().equals(username)) {
                if (user.getPassword().equals(password))
                    userPanel(user);
                else {
                    System.out.println("Wrong Password !!!");
                    login();
                }
                break;
            }

        System.out.println("There isn't any username like this...!");
        login();
    }

    private void userPanel(User user) {
        Scanner in = new Scanner(System.in);

        System.out.println(user + "\n  1. Show list of all Flights\n  2. Search Flights\n  3. Show Your Flight\n  4. Logout\n\n");

        try {
            switch (in.nextInt()) {
                case 1:
                    showAllFlights(user);
                    break;
                case 2:
                    searchFlight(user);
                    break;
                case 3:
                    myFlights(user);
                    break;
                case 4:
                    firstMenu();
                    break;
                default:
                    userPanel(user);
            }
        } catch (InputMismatchException ime) {
            System.out.println("your entry is not valid , choose a number between 1 to 4\n");
            userPanel(user);
        }

    }

    private void showAllFlights(User user) {
        Scanner in = new Scanner(System.in);

        printFlits(Data.getInstance().getAllFlights());
        System.out.println("- - - - - - - - - - - - - - -\n" + "  1.Back");

        try {
            switch (in.nextInt()) {
                case 1:
                    userPanel(user);
                    break;
                default:
                    showAllFlights(user);
            }
        } catch (InputMismatchException ime) {
            System.out.println("if you want to back to your panel , press 1\n");
            showAllFlights(user);
        }
    }

    private void printFlits(List<Flight> flightList) {
        for (Flight f : flightList)
            System.out.println(f);
    }

    private void searchFlight(User user) {
        Scanner in = new Scanner(System.in);

        Flight flight = findFlight(user);

        if (flight == null) {
            System.out.println("Flight not fount...!");
            userPanel(user);
        }

        System.out.println(flight);
        System.out.println("- - - - - - - - - - - - - - -\n" + "  1.add\n  2.back");

        try {
            switch (in.nextInt()) {
                case 1:
                    user.addFlight(flight);
                    System.out.println("Flight Added... :)");
                    userPanel(user);
                    break;
                case 2:
                    userPanel(user);
                    break;
                default:
                    searchFlight(user);
            }
        } catch (InputMismatchException ime) {
            System.out.println("if you want to back to your panel , press 2\n");
            searchFlight(user);
        }
    }

    private Flight findFlight(User user) {
        List<Flight> flights = findFrom();
        checkExistingFlight(flights, user);

        flights = findTo(flights);
        checkExistingFlight(flights, user);

        flights = findDay(flights);
        checkExistingFlight(flights, user);

        return findTime(flights);
    }

    private List<Flight> findFrom() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter from city : \n");
        String from = in.next();

        List<Flight> flights = new ArrayList<>();

        for (Flight f : Data.getInstance().getAllFlights())
            if (f.getFrom().equals(from))
                flights.add(f);

        printFlits(flights);
        return flights;
    }

    private List<Flight> findTo(List<Flight> flightList) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter to city : \n");
        String to = in.next();

        List<Flight> flights = new ArrayList<>();

        for (Flight f : flightList)
            if (f.getTo().equals(to))
                flights.add(f);

        printFlits(flights);
        return flights;
    }

    private List<Flight> findDay(List<Flight> flightList) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter day : \n");
        String day = in.next();

        List<Flight> flights = new ArrayList<>();

        for (Flight f : flightList)
            if (f.getDay().equals(day))
                flights.add(f);

        printFlits(flights);
        return flights;
    }

    private Flight findTime(List<Flight> flightList) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter time : \n");
        String time = in.next();

        for (Flight f : flightList)
            if (f.getTime().equals(time))
                return f;
        return null;
    }

    private void checkExistingFlight(List<Flight> flight, User user) {
        if (flight.isEmpty()) {
            System.out.println("No flight found...");
            userPanel(user);
        }
    }

    private void myFlights(User user) {
        Scanner in = new Scanner(System.in);

        printFlits(user.getFlightList());

        System.out.println("- - - - - - - - - - - - - - -\n" + "  1.Back");

        try {
            switch (in.nextInt()) {
                case 1:
                    userPanel(user);
                    break;
                default:
                    myFlights(user);
            }
        } catch (InputMismatchException ime) {
            System.out.println("if you want to back to your panel , press 1\n");
            myFlights(user);
        }
    }

}
