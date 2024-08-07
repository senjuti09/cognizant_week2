package LargeFileProcessor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LargeFileWriter {
    public void writeProcessedData(String outputFileName, List<String> processedData) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String data : processedData) {
                writer.write(data);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing the processed data.");
            e.printStackTrace();
        }
    }
}
