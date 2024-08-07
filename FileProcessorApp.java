package LargeFileProcessor;

import java.util.ArrayList;
import java.util.List;

public class FileProcessorApp {
    public static void main(String[] args) {
        LargeFileReader reader = new LargeFileReader();
        LargeFileWriter writer = new LargeFileWriter();

        // Attempt to read a non-existent file
        System.out.println("Attempting to read a non-existent file:");
        reader.readLargeFile("non_existent_input.txt");

        // Process the data (dummy data for illustration)
        List<String> processedData = new ArrayList<>();
        processedData.add("Processed entry 1");
        processedData.add("Processed entry 2");
        processedData.add("Processed entry 3");

        // Attempt to write to a restricted directory
        System.out.println("Attempting to write to a restricted directory:");
        writer.writeProcessedData("\\restricted_directory\\processed_output.txt", processedData);

        // Attempt to read an existing large file
        System.out.println("Reading a large file:");
        reader.readLargeFile("large_input.txt");

        // Write processed data to an output file
        System.out.println("Writing processed data:");
        writer.writeProcessedData("processed_output.txt", processedData);
    }
}
