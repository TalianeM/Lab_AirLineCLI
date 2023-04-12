import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        ArrayList<Passenger> passengers = new ArrayList<>();

        Passenger passenger1 = new Passenger("name1", 23,1);
        Passenger passenger2 = new Passenger("name2", 23,2);
        Passenger passenger3 = new Passenger("name3", 23,3);
        Passenger passenger4 = new Passenger("name1", 23,4);
        Passenger passenger5 = new Passenger("name5", 23,5);
        Passenger passenger6 = new Passenger("name6", 23,6);

        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        passengers.add(passenger4);
        passengers.add(passenger5);
        passengers.add(passenger6);

        ArrayList<Flight> flights = new ArrayList<>();

        Flight flight1 = new Flight("Berlin", 1);
        Flight flight2 = new Flight("Amsterdam", 2);
        Flight flight3 = new Flight("York", 3);

        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);

        Airline airline = new Airline();
        airline.setFlights(flights);
        airline.setPassengers(passengers);


//        airline.addFlight();
//        airline.cancelFlight();
//        airline.addPassenger();
        airline.addPassengerToFlight();
//        airline.displayFlights();
        airline.displayFlights();
//        airline.addFlight();
//        airline.cancelFlight();
//        airline.displayFlights();

        for (Passenger passenger: flight1.getPassengers()){
            System.out.println(passenger.getName());
        }
    }

}
