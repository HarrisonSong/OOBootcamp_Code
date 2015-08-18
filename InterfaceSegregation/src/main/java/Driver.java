public class Driver {
    private Vehicle vehicle;

    public Driver(Vehicle vehicle) {

        this.vehicle = vehicle;
    }

    public void moveForward() {
        allStop();
        vehicle.increaseLeftSpeed();
        vehicle.increaseRightSpeed();
    }

    public void moveBackward() {
        allStop();
        vehicle.decreaseLeftSpeed();
        vehicle.decreaseRightSpeed();
    }

    public void allStop() {
        vehicle.stopLeft();
        vehicle.stopRight();
    }

    public void turnLeft() {
        allStop();
        vehicle.increaseRightSpeed();
        vehicle.decreaseLeftSpeed();
    }

    public void turnRight() {
        allStop();
        vehicle.increaseLeftSpeed();
        vehicle.decreaseRightSpeed();
    }

    public void raiseAlarm() {
        vehicle.raiseAlarm();
    }
}
