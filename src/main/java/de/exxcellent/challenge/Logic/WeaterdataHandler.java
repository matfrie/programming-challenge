package main.java.de.exxcellent.challenge.Logic;


import main.java.de.exxcellent.challenge.input.CsvReader;

import java.util.ArrayList;

/**
 * Class that extracts and uses data from the Variable given bei the Reader
 * @author Matthias Friedrich
 */
public class WeaterdataHandler {
    CsvReader reader;
    ArrayList<String> data;

    public WeaterdataHandler(){
      reader = new CsvReader();
    }

    /**
     *
     * @param filePath the file to read from
     * @return the day with the least spread
     */
    public int dayWithMinimalTemperatureSpread(String filePath){

        int minSpreadDay = 0;

        int minSpreadDayRow = SpreadCalculator.minSpreadRow(data, 1,2);

        for (int k = 0; k <= minSpreadDayRow; k++) {
            String[] currentRow = data.get(k).split(",");
            minSpreadDay = Integer.parseInt(currentRow[0]);
        }

        return minSpreadDay;
    }

}
