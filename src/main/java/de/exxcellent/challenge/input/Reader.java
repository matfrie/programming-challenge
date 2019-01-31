package main.java.de.exxcellent.challenge.input;

import java.util.List;
import java.util.Map;

public interface Reader {

    /**
     * get the data from the File
     * @return am map with key: row number, value: colum values in a List
     */
    public List<String> getData(String filePath);
}
