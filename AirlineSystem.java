import java.util.Scanner;

public class AirlineSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger Name: ");
        String pname = sc.nextLine();

        System.out.print("Enter Flight Number: ");
        String fnum = sc.nextLine();

        Passenger passenger = new Passenger("P001", pname);
        Flight flight = new Flight(fnum, "Dhaka", "New York");

        Reservation res = new Reservation(passenger, flight);
        res.confirm();
    }
}

class Passenger {
    String name;

    public Passenger(String id, String name) {
        this.name = name;
    }
}

class Flight {
    String number;

    public Flight(String number, String from, String to) {
        this.number = number;
    }
}

class Reservation {
    Passenger passenger;
    Flight flight;

    public Reservation(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
    }

    void confirm() {
        System.out.println("Reservation for " + passenger.name + " on flight " + flight.number);
    }
}
