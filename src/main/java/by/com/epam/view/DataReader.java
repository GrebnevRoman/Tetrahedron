package by.com.epam.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public List<String> GetFromFile(String FILE_NAME) {
        List<String> linesArray = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line = null;
            String ls = System.getProperty("line.separator");
            while ((line = bufferedReader.readLine()) != null) {
                linesArray.add(line);
            }
        } catch (IOException ioException) {
            System.out.print("Error");
        }
        return linesArray;
    }

}
