import java.util.ArrayList;

public class Airline {

    private ArrayList<Flight> flights;
    private ArrayList<Passenger> passengers;
    private String name;

    public Airline(String name){
        this.name = name;
        this.passengers = new ArrayList<Passenger>();
        this.flights = new ArrayList<Flight>();
    }

    public void addFlight(String destination, int id){
        Flight newFlight = new Flight(destination, id);
        this.flights.add(newFlight);
    }

    public void cancelFlight(int id){
        for(Flight flight : this.flights){
            if(flight.getId() == id){
                this.flights.remove(flight);
            }
        }
    }

    public void cancelFlight(String destination, int id){
        Flight newFlight = new Flight(destination, id);
        this.flights.remove(newFlight);
    }

    public void addPassenger(String name, long contactNumber, int id){
        Passenger newPassenger = new Passenger(name, contactNumber, id);
        this.passengers.add(newPassenger);
    }

    public void addPassengerToFlight(Passenger newPassenger,Flight flight){
        flight.addPassenger(newPassenger);
    }
    public String displayFlights(){
        for (Flight flight : this.flights){
            return flight.getDestination();

        }
        return null;
    }
















    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
