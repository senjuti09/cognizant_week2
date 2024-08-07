package SalesAnalysis;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalesAnalysis {
    public static void main(String[] args) {
        List<SalesRecord> records = new ArrayList<>();
        records.add(new SalesRecord(1, "Alice", "North", 500.0, "2023-01-01", "Electronics", 10));
        records.add(new SalesRecord(2, "Bob", "South", 700.0, "2023-01-02", "Clothing", 20));
        records.add(new SalesRecord(3, "Charlie", "North", 200.0, "2023-01-03", "Electronics", 15));
        records.add(new SalesRecord(4, "David", "West", 900.0, "2023-01-04", "Electronics", 8));
        records.add(new SalesRecord(5, "Eve", "North", 300.0, "2023-01-05", "Clothing", 5));

        // Step 2: Filter and Sort Records
        List<SalesRecord> electronicsRecords = records.stream()
                .filter(record -> "Electronics".equals(record.getProductCategory()))
                .sorted(Comparator.comparing(SalesRecord::getDate))
                .collect(Collectors.toList());
        System.out.println("Filtered and Sorted Records: " + electronicsRecords);

        // Step 3: Calculate Average Sales
        double averageSales = records.stream()
                .filter(record -> "North".equals(record.getRegion()))
                .mapToDouble(SalesRecord::getAmount)
                .average()
                .orElse(0.0);
        System.out.println("Average Sales: " + averageSales);

        // Step 4: Find Top Sales Record
        SalesRecord topSalesRecord = records.stream()
                .max(Comparator.comparingDouble(SalesRecord::getAmount))
                .orElse(null);
        System.out.println("Top Sales Record: " + topSalesRecord);

        // Step 5: Parallel Stream Operations
        long startTime = System.currentTimeMillis();
        List<SalesRecord> parallelFilteredRecords = records.parallelStream()
                .filter(record -> "Electronics".equals(record.getProductCategory()))
                .sorted(Comparator.comparing(SalesRecord::getDate))
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Parallel Stream Time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        List<SalesRecord> sequentialFilteredRecords = records.stream()
                .filter(record -> "Electronics".equals(record.getProductCategory()))
                .sorted(Comparator.comparing(SalesRecord::getDate))
                .collect(Collectors.toList());
        endTime = System.currentTimeMillis();
        System.out.println("Sequential Stream Time: " + (endTime - startTime) + " ms");
    }
}
