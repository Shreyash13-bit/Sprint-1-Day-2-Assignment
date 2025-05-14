import java.util.*;

// Employee class
class Employee implements Comparable<Employee> {
    int id;
    String name;
    String department;
    double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Compare employees by name (for TreeSet sorting)
    public int compareTo(Employee other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    // To display employee info nicely
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Dept: " + department + ", Salary: " + salary;
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        // Create TreeSet to store employees sorted by name
        TreeSet<Employee> employeeSet = new TreeSet<>();

        // Add some employees
        employeeSet.add(new Employee(101, "Alice", "HR", 50000));
        employeeSet.add(new Employee(102, "Bob", "IT", 60000));
        employeeSet.add(new Employee(103, "Charlie", "Finance", 55000));
        employeeSet.add(new Employee(104, "David", "Marketing", 58000));

        // Display all employees in sorted order
        System.out.println("Employee Records (Sorted by Name):");
        for (Employee emp : employeeSet) {
            System.out.println(emp);
        }
    }
}
