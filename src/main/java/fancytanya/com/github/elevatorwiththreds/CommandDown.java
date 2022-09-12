package fancytanya.com.github.elevatorwiththreds;

public class CommandDown implements Command {
    Elevator elevator;

    public CommandDown(Elevator elevator) {
        this.elevator = elevator;
    }

    public void execute() {
        elevator.goDown();
    }
}
