package test.java.de.exxcellent.challenge;

import main.java.de.exxcellent.challenge.Logic.FootballdataHandler;
import main.java.de.exxcellent.challenge.Logic.WeaterdataHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodballHandleTest {

    @Test
    public void footballHandlerTest(){
        FootballdataHandler handler =  new FootballdataHandler();

        assertEquals (handler.minSpreadFoodballTeam(
                "C:\\Users\\Matze\\projekte\\programming-challenge\\src\\main\\resources\\de\\exxcellent\\challenge\\testFootballData")
                ,"Liverpool");
    }
}
