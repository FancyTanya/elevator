package fancytanya.com.github.elevatorwiththreds;

import java.util.concurrent.Semaphore;

public class ElevatorRunner {
    public static void main(String[] args) {

        final int MAX_QUANTITY_PASSENGERS = 5;

        Semaphore semaphore = new Semaphore(MAX_QUANTITY_PASSENGERS);
        Elevator elevator = new Elevator();
        Passenger passenger = new Passenger(semaphore);
        Floor floor = new Floor(passenger, semaphore);

        PassengerService passengerService = new PassengerService(new CommandUp(elevator), new CommandDown(elevator));
        ElevatorService elevatorService = new ElevatorService(passenger, floor, passengerService);

        elevatorService.elevatorMovement();
    }


}
