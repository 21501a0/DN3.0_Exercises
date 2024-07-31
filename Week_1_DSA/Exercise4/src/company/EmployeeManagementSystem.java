package company;

public class EmployeeManagementSystem {
    private Employee[] employeesArray;
    private int currentSize;
    private int maxSize;

    public EmployeeManagementSystem(int maxSize) {
        this.maxSize = maxSize;
        this.employeesArray = new Employee[maxSize];
        this.currentSize = 0;
    }

    public void addEmployee(Employee employee) {
        if (currentSize >= maxSize) {
            System.out.println("Array is full. Cannot add more employees.");
            return;
        }
        employeesArray[currentSize++] = employee;
        System.out.println("Employee " + employee.getName() + " added.");
    }

    public Employee findEmployee(int employeeId) {
        for (int i = 0; i < currentSize; i++) {
            if (employeesArray[i].getEmployeeId() == employeeId) {
                return employeesArray[i];
            }
        }
        return null;
    }

    public void displayEmployees() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println(employeesArray[i]);
        }
    }

    public void removeEmployee(int employeeId) {
        int indexToRemove = -1;
        for (int i = 0; i < currentSize; i++) {
            if (employeesArray[i].getEmployeeId() == employeeId) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove == -1) {
            System.out.println("Employee not found.");
            return;
        }
        for (int i = indexToRemove; i < currentSize - 1; i++) {
            employeesArray[i] = employeesArray[i + 1];
        }
        employeesArray[--currentSize] = null;
        System.out.println("Employee with ID " + employeeId + " removed.");
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        ems.addEmployee(new Employee(1, "Sophia", "Developer", 90000));
        ems.addEmployee(new Employee(2, "Neeha", "Manager", 100000));
        ems.addEmployee(new Employee(3, "Harsha", "Analyst", 950000));
        System.out.println();

        Employee employee = ems.findEmployee(2);
        if (employee != null) {
            System.out.println("Found: " + employee);
        } else {
            System.out.println("Employee not found.");
        }
        System.out.println();

        System.out.println("All employees:");
        ems.displayEmployees();
        System.out.println();

        ems.removeEmployee(2);
        System.out.println();

        System.out.println("All employees after removal:");
        ems.displayEmployees();
    }
}
