package exclass9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlightGenerator {
    private final int NUMBER_OF_ALL_FLIGHTS = 15;
    private Random rand;
    private List<Flight> flightList;


    public FlightGenerator() {
        rand = new Random();
        Data.getInstance().setAllFlights(makeFlights());
    }

    private List<Flight> makeFlights() {
        flightList = new ArrayList<>();
        int counter = 0;

        while (counter != NUMBER_OF_ALL_FLIGHTS) {
            Flight flight = makeNewFlight();

            if (checkNotExisting(flight)) {
                flightList.add(flight);
                counter++;
            }
        }
        return flightList;
    }

    private Flight makeNewFlight() {
        int flightNumber = 30000 + rand.nextInt(1000);
        return new Flight(makeFromOrTo(), makeFromOrTo(), makeDay(), makeTime(), flightNumber);
    }

    private String makeFromOrTo() {
        return Data.getInstance().getFromAndTo().get(rand.nextInt(Data.getInstance().getFromAndTo().size()));
    }

    private String makeDay() {
        return Data.getInstance().getDay().get(rand.nextInt(Data.getInstance().getDay().size()));
    }

    private String makeTime() {
        return Data.getInstance().getTime().get(rand.nextInt(Data.getInstance().getTime().size()));
    }


    private boolean checkNotExisting(Flight flight) {
        if (flight.getFrom().equals(flight.getTo()))
            return false;

        for (Flight f : flightList) {
            if (f.getFrom().equals(flight.getFrom()))
                if (f.getTo().equals(flight.getTo()))
                    if (f.getDay().equals(flight.getDay()))
                        if (f.getTime().equals(flight.getTime()))
                            if (checkFlightId(flight.getFlightId()))
                                return false;
        }
        return true;
    }

    private boolean checkFlightId(int flightId) {
        for (Flight f : flightList)
            if (f.getFlightId() == flightId)
                return true;
        return false;
    }

}
