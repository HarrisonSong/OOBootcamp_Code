
public class TankDriver implements TankDriverInterface {
    private int leftSpeed = 0;
    private int rightSpeed = 0;

    public int getLeftSpeed() {
        return leftSpeed;
    }

    public int getRightSpeed() {
        return rightSpeed;
    }

    public void stopLeft() {
        leftSpeed = 0;
    }

    public void stopRight() {
        rightSpeed = 0;
    }

    public void increaseLeftSpeed() {
        leftSpeed += 1;
    }

    public void decreaseLeftSpeed() {
        leftSpeed -= 1;
    }

    public void increaseRightSpeed() {
        rightSpeed += 1;
    }

    public void decreaseRightSpeed() {
        rightSpeed -= 1;
    }

    public void raiseAlarm(){
        throw new AlarmRaisedException();
    }

    public void reset() {
        leftSpeed = 0;
        rightSpeed = 0;
    }
}
