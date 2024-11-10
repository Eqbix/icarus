package controller;

import model.Customer;
import service.CustomerService;

import java.util.List;

public class CustomerController {
    private CustomerService customerService;

    public CustomerController() {
        this.customerService = new CustomerService();
    }

    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    public void addCustomer(Customer customer) {
        customerService.addCustomer(customer);
    }

    public void updateCustomer(Customer customer) {
        customerService.updateCustomer(customer);
    }

    public void deleteCustomer(int id) {
        customerService.deleteCustomer(id);
    }
}
