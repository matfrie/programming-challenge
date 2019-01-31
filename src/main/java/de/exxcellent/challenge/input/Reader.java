package main.java.de.exxcellent.challenge.input;

import java.util.List;
import java.util.Map;

public interface Reader {

    /**
     * get the data from the File ignoring the headers header cow
     * @param filePath path of the file to read
     * @return a List of the values of the colums
     */
    public List<String> getData(String filePath);
}
