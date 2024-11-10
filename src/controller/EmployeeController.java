package controller;

import model.Employee;
import service.EmployeeService;

import java.util.List;

public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController() {
        this.employeeService = new EmployeeService();
    }

    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    public void addEmployee(Employee employee) {
        employeeService.addEmployee(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeService.updateEmployee(employee);
    }

    public void deleteEmployee(int id) {
        employeeService.deleteEmployee(id);
    }
}
