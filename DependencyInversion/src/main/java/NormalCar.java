
public class NormalCar extends Car {
    public void accelerate() {
        speed += 1;
    }

    public void decelerate() {
        if(speed > 0){
            speed -= 1;
        }
    }
}
