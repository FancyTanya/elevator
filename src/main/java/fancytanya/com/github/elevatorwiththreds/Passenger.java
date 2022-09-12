package fancytanya.com.github.elevatorwiththreds;

import java.util.concurrent.Semaphore;

import static fancytanya.com.github.elevatorWithThreds.Service.randomIntGeneration;

public class Passenger extends Thread {

    private final int MIN_PASSENGER_QUANTITY = 0;
    private final int MAX_PASSENGER_QUANTITY = 10;

    private String name;
    private Semaphore elevator;
    private int currentFloor;


    public Passenger(Semaphore elevator) {
        this.elevator = elevator;
        this.start();
    }

    @Override
    public void run() {
        try {
            try {
                for (int i = 0; i < randomPassengersGeneration(); i++) {
                    Passenger passenger = new Passenger(elevator);
                }
                elevator.acquire();
                System.out.println("Passenger " + currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            elevator.release();
        }
    }

    public int randomPassengersGeneration() {
        return randomIntGeneration(MAX_PASSENGER_QUANTITY, MIN_PASSENGER_QUANTITY);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

}
