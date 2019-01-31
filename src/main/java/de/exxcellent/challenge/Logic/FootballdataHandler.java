package main.java.de.exxcellent.challenge.Logic;

import main.java.de.exxcellent.challenge.input.CsvReader;

import java.util.ArrayList;

public class FootballdataHandler {

    CsvReader reader;
    ArrayList<String> data;

    public FootballdataHandler(){
        reader = new CsvReader();
    }

    public String minSpreadFoodballTeam(String filePath){

        String minSpreadTeam = "";

        data = (ArrayList<String>) reader.getData(filePath);

        int minSpreadRow = SpreadCalculator.minSpreadRow(data, 6,7);

        for (int k = 0; k <= minSpreadRow; k++) {
            String[] currentRow = data.get(k).split(",");
            minSpreadTeam = currentRow[0];
        }

        return minSpreadTeam;
    }

}
