package main.java.de.exxcellent.challenge.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CsvReader implements Reader{



    @Override
    public List<String> getData(String filePath) {

        ArrayList<String> data = new ArrayList<>();
        File file = new File(filePath);

        Scanner inputStram = null;
        try {
            inputStram = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //ignore first line
        inputStram.next();

        while (inputStram.hasNext()){
            String row = inputStram.next();
            data.add(row);
            System.out.print(data);
        }

        return data;
    }
}
