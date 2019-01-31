package main.java.de.exxcellent.challenge.Logic;

public class SpreadCalculator {



    /**
     * get the spread between 2 nummbers
     * @param max
     * @param min
     * @return the spread
     */
    public static int spread(String max, String min){
        int spread = Integer.parseInt(max) - Integer.parseInt(min);
        return spread;
    }
}
