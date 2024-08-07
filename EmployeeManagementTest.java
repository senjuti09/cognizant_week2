package Employee;

public class EmployeeManagementTest {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();

        // Add employees
        management.addEmployee(new Employee(1, "John Doe", "123 Main St"));
        management.addEmployee(new Employee(2, "Jane Smith", "456 Oak St"));

        // Display employees
        management.displayEmployees();

        // Update an employee's address
        management.updateEmployee(1, "789 Pine St");

        // Display employees again
        management.displayEmployees();

        // Remove an employee
        management.removeEmployee(2);

        // Display employees again
        management.displayEmployees();
    }
}
