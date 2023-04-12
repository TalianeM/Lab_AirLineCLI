import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirlineTest {

    Airline airline;
    Passenger passenger;
    Flight flight;
    @BeforeEach
    public void setUp(){
        airline = new Airline();
        flight = new Flight("Berlin",1);
        passenger = new Passenger("name2",23,8);
    }

    @Test
    public void canAddFlight(){
        airline.addFlight("York", 2);
        assertThat(airline.getFlights().size()).isEqualTo(1);
    }

    @Test
    public void canCancelFlight(){
        airline.addFlight("Berlin",1);
        airline.cancelFlight(1);
        assertThat(airline.getFlights().size()).isEqualTo(0);
    }

    @Test
    public void canAddPassenger(){
        airline.addPassenger("name1",23,1);
        assertThat(airline.getPassengers().size()).isEqualTo(1);
    }

    @Test

    public void canAddPassengerToFlight(){
        airline.addPassengerToFlight(passenger,flight);
        assertThat(flight.getPassengers().size()).isEqualTo(1);
    }

    @Test
    public void canGetPassengers(){
        assertThat(airline.getPassengers().size()).isEqualTo(0);
    }

}
