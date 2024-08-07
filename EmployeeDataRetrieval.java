package Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDataRetrieval {
    public void getEmployees() {
        JDBCConnection jdbcConnection = new JDBCConnection();
        Connection connection = jdbcConnection.getConnection();
        if (connection != null) {
            try {
                String query = "SELECT * FROM employees";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String position = resultSet.getString("position");
                    double salary = resultSet.getDouble("salary");
                    System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        EmployeeDataRetrieval retrieval = new EmployeeDataRetrieval();
        retrieval.getEmployees();
    }
}
