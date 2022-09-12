package fancytanya.com.github.elevatorwiththreds;
import java.util.concurrent.Semaphore;

import static fancytanya.com.github.elevatorWithThreds.Service.randomIntGeneration;

public class Floor extends Thread{

    private final int MIN_FLOOR = 5;
    private final int MAX_FLOOR = 20;

    private final Passenger passenger;

    private boolean directionUp = true;
    private int floorCounter = 1;
    private Semaphore elevator;

    public Floor(Passenger passenger, Semaphore elevator) {
        this.passenger = passenger;
        this.elevator = elevator;
        this.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < floorGeneration(); i++) {
                Floor floor = new Floor(passenger, elevator);
            }
            elevator.acquire();
            System.out.println("Current floor is " + floorCounter);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            elevator.release();
        }
    }

    public int floorGeneration() {
        return randomIntGeneration(MAX_FLOOR, MIN_FLOOR);
    }
    public int getDesiredFloor() {
        return floorGeneration();
    }

    public int getFloorCounter() {
        return floorCounter;
    }
}
