package main.java.de.exxcellent.challenge.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Imlementation of Reader Interface for Csv files
 * @author Matthias Friedrich
 */
public class CsvReader implements Reader {


    @Override
    public List<String> getData(String filePath) {

        ArrayList<String> data = new ArrayList<>();
        File file = new File(filePath);

        try {
            Scanner inputStram = new Scanner(file);

            inputStram.next();

            while (inputStram.hasNext()) {
                //take the next row and add ist to the data
                //ignore first line

                while (inputStram.hasNext()) {
                    String row = inputStram.next();
                    data.add(row);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return data;
    }
}