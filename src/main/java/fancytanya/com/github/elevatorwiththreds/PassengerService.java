package fancytanya.com.github.elevatorWithThreds;

public class PassengerService {

    Command up;
    Command down;

    public PassengerService(Command up, Command down) {
        this.up = up;
        this.down = down;
    }

    public void selectUp() {
        up.execute();
    }

    public void selectDown() {
        down.execute();
    }
}
