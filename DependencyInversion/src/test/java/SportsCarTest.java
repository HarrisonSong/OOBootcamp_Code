import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SportsCarTest {

    @Test
    public void shouldAccelerateBy2() {
        SportsCar sportsCar = new SportsCar();

        int initialSpeed = sportsCar.getSpeed();
        sportsCar.accelerate();

        assertThat(sportsCar.getSpeed() - initialSpeed, is(2));
    }

    @Test
    public void shouldDecelerateBy2() {
        SportsCar sportsCar = new SportsCar();

        sportsCar.accelerate();
        sportsCar.accelerate();
        int initialSpeed = sportsCar.getSpeed();
        sportsCar.decelerate();

        assertThat(sportsCar.getSpeed() - initialSpeed, is(-2));
    }
}
