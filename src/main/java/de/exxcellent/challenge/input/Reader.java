package main.java.de.exxcellent.challenge.input;

import java.util.List;
import java.util.Map;

public interface Reader {

    /**
     * get the data from the File ignoring the headers header cow
     * @return am map with key: row number, value: colum values in a List
     */
    public Map<Integer, List<String>> getData();
}
