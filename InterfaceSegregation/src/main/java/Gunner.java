public class Gunner {
    private Gun gun;

    public Gunner(Gun tank) {

        this.gun = tank;
    }

    public void raiseGun() {
        gun.raiseGun();
    }

    public void lowerGun() {
        gun.lowerGun();
    }

    public void raiseGunToTop() {
        while(true) {
            int initialRake = gun.getGunRake();
            raiseGun();
            if (initialRake == gun.getGunRake()) break;
        }
    }

    public void lowerGunToBottom() {
        while(true) {
            int initialRake = gun.getGunRake();
            lowerGun();
            if (initialRake == gun.getGunRake()) break;
        }
    }

    public void rotateGunLeft() {
        gun.rotateGunLeft();
    }

    public void rotateGunRight() {
        gun.rotateGunRight();
    }

    public void rotateGunToFront() {
        while (gun.getGunAngle() != 0) rotateGunRight();
    }

    public void fire() throws OutOfShellsException {
        gun.fire();
    }

    public void raiseAlarm() {
        gun.raiseAlarm();
    }
}
