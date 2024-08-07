package LargeFileProcessor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LargeFileReader {
    public void readLargeFile(String inputFileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Process each line (e.g., parse and print sales records)
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file " + inputFileName + " was not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
