package main.java.de.exxcellent.challenge;

import main.java.de.exxcellent.challenge.Logic.FootballdataHandler;
import main.java.de.exxcellent.challenge.Logic.WeaterdataHandler;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        WeaterdataHandler weaterdataHandler = new WeaterdataHandler();
        FootballdataHandler footballdataHandler = new FootballdataHandler();


        String dayWithSmallestTempSpread = weaterdataHandler.dayWithMinimalTemperatureSpread("src\\main\\resources\\de\\exxcellent\\challenge\\testWeatherData");     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = footballdataHandler.minSpreadFoodballTeam("src\\main\\resources\\de\\exxcellent\\challenge\\testFootballData"); // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
