package test.java.de.exxcellent.challenge;

import main.java.de.exxcellent.challenge.Logic.WeaterdataHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeaterdataHandlerTest {


    @Test
    public void weaterHandlerTest(){
        WeaterdataHandler handler = new WeaterdataHandler();

        assertEquals (handler.dayWithMinimalTemperatureSpread(
                "src\\main\\resources\\de\\exxcellent\\challenge\\testWeatherData")
        ,5);
    }
}
