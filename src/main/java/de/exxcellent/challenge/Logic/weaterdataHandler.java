package main.java.de.exxcellent.challenge.Logic;


import main.java.de.exxcellent.challenge.input.CsvReader;

import java.util.ArrayList;

/**
 * Class that extracts and uses data from the Variable given bei the Reader
 * @author Matthias Friedrich
 */
public class weaterdataHandler {
    CsvReader reader;
    ArrayList<String> data;

    public weaterdataHandler(){
      reader = new CsvReader();
    }

    /**
     *
     * @param filePath the file to read from
     * @return the day with the least spread
     */
    public int dayWithMinimalTemperatureSpread(String filePath){

        int MinSpreadDay = 0;
        int MinSpread = 0;

        data = (ArrayList<String>) reader.getData(filePath);

        //finde the day with the least tempratur spread
        for(int i = 1; i < data.size(); i++){

            //extract day, minTemp and maxTamp out of the data
            String[] currentRow = data.get(i).split(",");
            String currentDay = currentRow[1];
            String currentMaxTemp = currentRow[1];
            String currentMinTemp = currentRow[2];

            //the firs day is always the current min spread
            if(MinSpreadDay == 0) {
                MinSpreadDay = 1;
                MinSpread = spread(currentMaxTemp, currentMinTemp);
            }

            //test if the current day is the day with the least spread
            else {
                int currentMinSpread = spread(currentMaxTemp, currentMinTemp);

                if(currentMinSpread < MinSpread ){
                    MinSpreadDay = Integer.parseInt(currentDay);
                    MinSpread = currentMinSpread;
                }
            }
        }
        return MinSpreadDay;
    }

    /**
     * get the spread
     * @param max
     * @param min
     * @return the spread
     */
    private int spread(String max, String min){
        int spread = Integer.parseInt(max) - Integer.parseInt(min);
        return spread;
    }
}
