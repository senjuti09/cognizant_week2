package Employee;
import java.util.ArrayList;

public class EmployeeManagement {
    private ArrayList<Employee> employees;

    public EmployeeManagement() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public boolean removeEmployee(int employeeId) {
        return employees.removeIf(emp -> emp.getId() == employeeId);
    }

    public boolean updateEmployee(int employeeId, String newAddress) {
        for (Employee emp : employees) {
            if (emp.getId() == employeeId) {
                emp.setAddress(newAddress);
                return true;
            }
        }
        return false;
    }

    public void displayEmployees() {
        System.out.println("Employee List:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
