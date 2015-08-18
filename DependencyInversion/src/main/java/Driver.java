public class Driver {

    public Radio radio;
    public Car car;

    public Driver(Radio radio, Car car) {
        this.radio = radio;
        this.car = car;
    }

    public void listenToRadio(){
        radio.turnOn();
    }

    public void listeningToFavouriteSong(){
        radio.turnUp();
    }

    public void talkingToPassenger(){
        radio.turnDown();
    }

    public void concentrate(){
        radio.turnOff();
    }

    public void speedUp(){
        car.accelerate();
    }

    public void slowDown(){
        car.decelerate();
    }
}
