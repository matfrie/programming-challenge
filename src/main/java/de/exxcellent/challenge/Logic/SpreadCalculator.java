package main.java.de.exxcellent.challenge.Logic;

import java.util.ArrayList;

public class SpreadCalculator {


    /**
     * Calculate the row with the least spread between the tow given colums out of the data
     * @param data the with tha table
     * @param Colum1 the first Column
     * @param Colum2 the first Column
     * @return the number of the row with the least spread
     */
    public static int minSpreadRow(ArrayList<String> data, int Colum1, int Colum2){

        int MinSpreadRow = 0;
        int MinSpread = 0;

        for(int i = 0; i < data.size(); i++){

            //extract day, min and max out of the data
            String[] currentRow = data.get(i).split(",");
            int currentMaxTemp = Integer.parseInt(currentRow[Colum1]);
            int currentMinTemp = Integer.parseInt(currentRow[Colum2]);

            //the firs day is always the current min spread
            if(MinSpreadRow == 0) {
                MinSpreadRow = 1;
                MinSpread = SpreadCalculator.spread(currentMaxTemp, currentMinTemp);
            }

            //test if the current day is the day with the least spread
            else {
                int currentMinSpread = spread(currentMaxTemp, currentMinTemp);

                if(currentMinSpread < MinSpread ){
                    MinSpreadRow = i;
                    MinSpread = currentMinSpread;
                }
            }
        }
        return MinSpreadRow;
    }

    /**
     * get the spread between 2 nummbers
     * @param max
     * @param min
     * @return the spread
     */
    public static int spread(int max, int min){
        //if max is lower than mix, switch them
        if(max < min){
            int temp = min;
            min = max;
            max =min;
        }

        int spread = max - min;
        return spread;
    }
}
