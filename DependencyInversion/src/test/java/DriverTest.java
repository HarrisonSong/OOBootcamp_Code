import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class DriverTest {
    @Test
    public void shouldSpeedUp(){
        Driver driver = new Driver(new Radio(), new NormalCar());
        int initialSpeed = driver.car.getSpeed();
        driver.speedUp();

        assertThat(driver.car.getSpeed() - initialSpeed, is(1));
    }

    @Test
    public void shouldSlowDown(){
        Driver driver = new Driver(new Radio(), new NormalCar());
        driver.speedUp();
        driver.speedUp();
        int initialSpeed = driver.car.getSpeed();
        driver.slowDown();

        assertThat(driver.car.getSpeed() - initialSpeed, is(-1));
    }

    @Test
    public void shouldTurnOnRadio(){
        Driver driver = new Driver(new Radio(), new NormalCar());
        driver.listenToRadio();

        assertTrue(driver.radio.isTurnedOn());
    }

    @Test
    public void shouldTurnOffRadioToConcentrate(){
        Driver driver = new Driver(new Radio(), new NormalCar());
        driver.listenToRadio();
        driver.concentrate();

        assertFalse(driver.radio.isTurnedOn());
    }

    @Test
    public void shouldTurnRadioUpWhenFavouriteSongComesOn(){
        Driver driver = new Driver(new Radio(), new NormalCar());
        driver.listenToRadio();
        int initialVolume = driver.radio.getVolume();

        driver.listeningToFavouriteSong();

        assertThat(driver.radio.getVolume() - initialVolume, is(1));
    }

    @Test
    public void shouldTurnRadioDownToTalkToPassenger(){
        Driver driver = new Driver(new Radio(), new NormalCar());
        driver.listenToRadio();
        int initialVolume = driver.radio.getVolume();

        driver.talkingToPassenger();

        assertThat(driver.radio.getVolume() - initialVolume, is(-1));
    }
}
