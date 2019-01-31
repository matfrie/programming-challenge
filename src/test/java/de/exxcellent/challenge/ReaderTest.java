package test.java.de.exxcellent.challenge;

import main.java.de.exxcellent.challenge.input.CsvReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReaderTest {

    CsvReader reader;
    ArrayList<String> data;

    @BeforeEach
    public void setUp() {
        reader = new CsvReader();
        data = new ArrayList<>();
        data.add("11,22,33");
        data.add("44,55,66");
    }

    @Test
    public void ReaderTest() { assertEquals
            (reader.getData("src\\main\\resources\\de\\exxcellent\\challenge\\test.csv")
                    ,data);}
}
