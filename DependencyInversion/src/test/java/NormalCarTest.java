import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NormalCarTest {

    @Test
    public void shouldAccelerateBy2() {
        NormalCar car = new NormalCar();

        int initialSpeed = car.getSpeed();
        car.accelerate();

        assertThat(car.getSpeed() - initialSpeed, is(1));
    }

    @Test
    public void shouldDecelerateBy2() {
        NormalCar car = new NormalCar();

        car.accelerate();
        car.accelerate();
        int initialSpeed = car.getSpeed();
        car.decelerate();

        assertThat(car.getSpeed() - initialSpeed, is(-1));
    }
}
