package main.java.de.exxcellent.challenge.Logic;

import main.java.de.exxcellent.challenge.input.CsvReader;

import java.util.ArrayList;

public class FootballdataHandler {

    CsvReader reader;
    ArrayList<String> data;

    public FootballdataHandler(){
        reader = new CsvReader();
    }

    /**
     * Gets data from a file and finds the Team with teh least spread between Goals and Goals Allowed
     * @param filePath the file to read from
     * @return the Team with the least spread
     */
    public String minSpreadFoodballTeam(String filePath){

        //get the data of the file
        data = (ArrayList<String>) reader.getData(filePath);

        //get the row with the least spread
        int minSpreadRow = SpreadCalculator.minSpreadRow(data, 6,7);

        String minSpreadTeam = "";

        for (int k = 0; k <= minSpreadRow; k++) {
            String[] currentRow = data.get(k).split(",");
            minSpreadTeam = currentRow[0];
        }

        return minSpreadTeam;
    }

}
