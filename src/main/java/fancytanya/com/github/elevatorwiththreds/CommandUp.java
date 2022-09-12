package fancytanya.com.github.elevatorwiththreds;

public class CommandUp implements Command {
    Elevator elevator;

    public CommandUp(Elevator elevator) {
        this.elevator = elevator;
    }

    public void execute() {
        elevator.goUp();
    }
}
