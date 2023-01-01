package exclass9;

public class Flight {
    private String from;
    private String to;
    private String day;
    private String time;
    private int flightId;

    public Flight(String from, String to, String day, String time, int flightCode) {
        this.from = from;
        this.to = to;
        this.day = day;
        this.time = time;
        this.flightId = flightCode;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public int getFlightId() {
        return flightId;
    }

    @Override
    public String toString() {
        return "|" + setSpaceLen(String.valueOf(this.flightId)) + "|" + setSpaceLen(this.from) + "|" + setSpaceLen(this.to) + "|" + setSpaceLen(this.day) + "|" + setSpaceLen(this.time) + "|\n";
    }

    private String setSpaceLen(String str) {
        String newStr = "  " + str;
        for (int i = 0; i < 15 - str.length(); i++) {
            newStr += " ";
        }
        return newStr + "  ";
    }


}
