package fancytanya.com.github.elevatorwithcontainers;

import java.util.List;

public class Passenger {
    private int currentFloor;
    private int wonderFloor;

    private List<Passenger> arrivedPassengers;

    public List<Passenger> getArrivedPassengers(Passenger passenger) {
        arrivedPassengers.add(passenger);
        return arrivedPassengers;
    }
}
