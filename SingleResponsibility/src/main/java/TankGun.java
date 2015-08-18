
public class TankGun implements TankGunnerInterface {
    private int gunAngle = 0;
    private int gunRake = 0;
    private int remainingShells;

    public TankGun(int remainingShells){
        this.remainingShells = remainingShells;
    }

    public int getGunAngle() {
        return gunAngle;
    }

    public int getGunRake() {
        return gunRake;
    }

    public int getRemainingShells() {
        return remainingShells;
    }

    public void rotateGunLeft() {
        gunAngle -= 45;
        while (gunAngle < 0) gunAngle += 360;
    }

    public void rotateGunRight() {
        gunAngle += 45;
        while (gunAngle >= 360) gunAngle -= 360;
    }

    public void raiseGun() {
        if (gunRake < 45) gunRake += 5;
    }

    public void lowerGun() {
        if (gunRake > 0) gunRake -= 5;
    }

    public void fire() throws OutOfShellsException {
        if (remainingShells <= 0) throw new OutOfShellsException();
        remainingShells -= 1;
    }

    public void raiseAlarm() {
        throw new AlarmRaisedException();
    }

    public void reset() {
        gunAngle = 0;
        gunRake = 0;
    }
}
