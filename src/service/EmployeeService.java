package service;

import model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(String employeeId) {
        employees.removeIf(employee -> employee.getEmployeeId().equals(employeeId));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee findEmployeeById(String employeeId) {
        return employees.stream()
                .filter(employee -> employee.getEmployeeId().equals(employeeId))
                .findFirst()
                .orElse(null);
    }

    public void updateEmployee(Employee employee) {

    }

    public void deleteEmployee(int id) {

    }
}
