package fancytanya.com.github.elevatorwiththreds;

public class ElevatorService {
    Passenger passenger;
    Floor floor;
    PassengerService passengerService;

    public ElevatorService(Passenger passenger, Floor floor, PassengerService passengerService) {
        this.passenger = passenger;
        this.floor = floor;
        this.passengerService = passengerService;
    }

    public void elevatorMovement() {
        if (passenger.getCurrentFloor() == 1 || floor.floorGeneration() > passenger.getCurrentFloor()) {
            passengerService.selectUp();
        } else {
            passengerService.selectDown();
        }
    }
}
