import java.util.ArrayList;
import java.util.Scanner;

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


    public void addFlight(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input flight destination");
        String destination = scanner.nextLine();

        System.out.println(("Please input flight id"));
        int id = scanner.nextInt();

        Flight newFlight = new Flight(destination, id);
        this.flights.add(newFlight);

    }






//    public void cancelFlight(int id){
//        for(Flight flight : this.flights){
//            if(flight.getId() == id){
//                this.flights.remove(flight);
//            }
//        }
//    }
//
//    public void cancelFlight(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input flight id");
//        int id = scanner.nextInt();
//
//        for(Flight flight : this.flights){
//            if(flight.getId() == id){
//                this.flights.remove(flight);
//            }
//        }
//    }

    public void cancelFlight(String destination, int id){
        Flight newFlight = new Flight(destination, id);
        this.flights.remove(newFlight);
    }

    public void cancelFlight(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input flight destination");
        String destination = scanner.nextLine();

        System.out.println("Please input flight id");
        int id = scanner.nextInt();


        Flight newFlight = new Flight(destination, id);
        this.flights.remove(newFlight);
    }



    public void addPassenger(String name, long contactNumber, int id){
        Passenger newPassenger = new Passenger(name, contactNumber, id);
        this.passengers.add(newPassenger);
    }

    public void addPassenger(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input passenger name");
        String name = scanner.nextLine();

        System.out.println("Please input passenger contact number");
        long contactNumber = scanner.nextLong();

        System.out.println("Please input passenger id");
        int id = scanner.nextInt();

        Passenger newPassenger = new Passenger(name, contactNumber, id);
        this.passengers.add(newPassenger);
    }

    public void addPassengerToFlight(Passenger newPassenger,Flight flight){
        flight.addPassenger(newPassenger);
    }

    public void addPassengerToFlight(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input passenger id");
        int passengerId = scanner.nextInt();

        System.out.println("Please input flight id");
        int flightId = scanner.nextInt();

        Passenger newPassenger = null;
        for(Passenger passenger : this.passengers){
            if (passenger.getId() == passengerId){
                newPassenger = passenger;
                break;
            }
        }

        Flight newFlight = null;
        for(Flight flight :this.flights){
            if (flight.getId() == flightId){
                newFlight = flight;
                break;
            }
        }

        newFlight.addPassenger(newPassenger);

    }

    public void displayFlights(){
        for (Flight flight : this.flights){
            System.out.println("Flight number " + flight.getId() + " goes to " + flight.getDestination());
        }
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
