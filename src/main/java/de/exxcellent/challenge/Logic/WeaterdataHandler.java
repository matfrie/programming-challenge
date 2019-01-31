package main.java.de.exxcellent.challenge.Logic;


import main.java.de.exxcellent.challenge.input.CsvReader;

import java.util.ArrayList;

/**
 * Class that extracts and uses weatherdata from the Variable given bei the Reader
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
    public String dayWithMinimalTemperatureSpread(String filePath){

        //get the data of the file
        data = (ArrayList<String>) reader.getData(filePath);

        //get the row with the least spread
        int minSpreadDayRow = SpreadCalculator.minSpreadRow(data, 1,2);

        String minSpreadDay = "";

        //go to through till the right row and get the day
        for (int k = 0; k <= minSpreadDayRow; k++) {
            String[] currentRow = data.get(k).split(",");
            minSpreadDay = currentRow[0];
        }

        return minSpreadDay;
    }

}
