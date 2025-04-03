class Ticket {
    private String passengerName;
    private String flightNumber;

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}

public class TicketDemo {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        t.setPassengerName("Emma Watson");
        t.setFlightNumber("AI202");

        System.out.println("Passenger: " + t.getPassengerName());
        System.out.println("Flight: " + t.getFlightNumber());
    }
}
