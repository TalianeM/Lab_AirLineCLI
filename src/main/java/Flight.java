import java.util.ArrayList;

public class Flight {

        private String destination;
        private int id;
        private ArrayList<Passenger> passengers;

        public Flight(String destination, int id){
            this.destination = destination;
            this.id = id;
            this.passengers = new ArrayList<Passenger>();
        }

        public String getDestination() {
                return destination;
        }

        public void setDestination(String destination) {
                this.destination = destination;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public ArrayList<Passenger> getPassengers() {
                return passengers;
        }

        public void setPassengers(ArrayList<Passenger> passengers) {
                this.passengers = passengers;
        }

        public void addPassenger(Passenger passenger){
                this.passengers.add(passenger);
        }


}
