package fancytanya.com.github.elevatorwithcontainers;

import java.util.Map;

public class Elevator {

    private Floor floor;
    private int MAX_PASSENGER_AMOUNT = 5;
    private int currentFloor;
    private Direction direction;
    private Passenger[] boardPassengers;
    private Map<Floor, Passenger> passengerMap;

    public Elevator() {
        Passenger[] passengers = new Passenger[MAX_PASSENGER_AMOUNT];
    }

    public void registerRequest() {
    }

    public void removePassengers() {

    }
}
