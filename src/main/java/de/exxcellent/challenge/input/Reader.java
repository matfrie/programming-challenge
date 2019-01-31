package main.java.de.exxcellent.challenge.input;

import java.util.List;
import java.util.Map;

public interface Reader {

    /**
     * get the data from the File and write ist into a List
     * @return am List with every entry beeing the next row of the data
     */
    public List<String> getData(String filePath);
}
