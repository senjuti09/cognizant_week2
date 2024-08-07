package LogManagementSystem;
public class LogApp {
    public static void main(String[] args) {
        LogWriter writer = new LogWriter();
        LogReader reader = new LogReader();

        String fileName = "logs.txt";

        // Write log entries to the file
        writer.writeLog(fileName, "Log entry 1");
        writer.writeLog(fileName, "Log entry 2");
        writer.writeLog(fileName, "Log entry 3");

        // Read and display log entries from the file
        System.out.println("Log entries:");
        reader.readLogs(fileName);

        // Attempt to read from a non-existent file to demonstrate error handling
        System.out.println("Attempting to read a non-existent file:");
        reader.readLogs("non_existent_file.txt");
    }
}
