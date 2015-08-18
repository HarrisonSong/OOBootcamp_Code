
public interface Gun extends Alarmable {

    void raiseGun();
    void lowerGun();
    int getGunRake();
    int getGunAngle();
    void rotateGunLeft();
    void rotateGunRight();
    void fire() throws OutOfShellsException;
}
