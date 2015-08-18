public class SportsCar extends Car {

    public void accelerate() {
        speed += 2;
    }

    public void decelerate() {
        if(speed > 1){
            speed -= 2;
        }
    }
}
