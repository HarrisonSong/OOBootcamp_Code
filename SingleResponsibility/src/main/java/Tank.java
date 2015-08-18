public class Tank {

    private TankDriver driver;
    private TankGun gun;

    public Tank(TankDriver driver, TankGun gun) {
        this.driver = driver;
        this.gun = gun;
    }

    public int getLeftSpeed() {
        return driver.getLeftSpeed();
    }

    public int getRightSpeed() {
        return driver.getRightSpeed();
    }

    public int getGunAngle() {
        return gun.getGunAngle();
    }

    public int getGunRake() {
        return gun.getGunRake();
    }

    public int getRemainingShells() {
        return gun.getRemainingShells();
    }


    public void stopLeft() {
        driver.stopLeft();
    }

    public void stopRight() {
        driver.stopRight();
    }

    public void increaseLeftSpeed() {
        driver.increaseLeftSpeed();
    }

    public void decreaseLeftSpeed() {
        driver.decreaseLeftSpeed();
    }

    public void increaseRightSpeed() {
        driver.increaseRightSpeed();
    }

    public void decreaseRightSpeed() {
        driver.decreaseRightSpeed();
    }

    public void rotateGunLeft() {
        gun.rotateGunLeft();
    }

    public void rotateGunRight() {
        gun.rotateGunRight();
    }

    public void raiseGun() {
        gun.raiseGun();
    }

    public void lowerGun(){
        gun.lowerGun();
    }

    public void fire() throws OutOfShellsException {
        gun.fire();
    }

    public void raiseAlarm() {
        driver.raiseAlarm();
    }

    public void reset() {
        driver.reset();
        gun.reset();
    }
}
