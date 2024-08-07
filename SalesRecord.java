package SalesAnalysis;
public class SalesRecord {
    private int recordId;
    private String salesPerson;
    private String region;
    private double amount;
    private String date;
    private String productCategory;
    private int quantity;

    public SalesRecord(int recordId, String salesPerson, String region, double amount, String date, String productCategory, int quantity) {
        this.recordId = recordId;
        this.salesPerson = salesPerson;
        this.region = region;
        this.amount = amount;
        this.date = date;
        this.productCategory = productCategory;
        this.quantity = quantity;
    }

    public int getRecordId() {
        return recordId;
    }

    public String getSalesPerson() {
        return salesPerson;
    }

    public String getRegion() {
        return region;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "SalesRecord{" +
                "recordId=" + recordId +
                ", salesPerson='" + salesPerson + '\'' +
                ", region='" + region + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
