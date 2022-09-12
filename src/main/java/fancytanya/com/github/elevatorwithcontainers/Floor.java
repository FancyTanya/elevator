package fancytanya.com.github.elevatorwithcontainers;

import java.util.Queue;

public class Floor {
    private int waitingPassengers;
    private Elevator elevator;
    private Queue passengersUp;
    private Queue passengersDown;


    public void arrivedPassengers() {
        elevator.removePassengers();
    }

    public void makeRequest() {}


}
