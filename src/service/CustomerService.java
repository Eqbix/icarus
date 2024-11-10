package service;

import model.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customers;

    public CustomerService() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(String id) {
        customers.removeIf(customer -> customer.getId().equals(id));
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer findCustomerById(String id) {
        return null;
    }

    public void updateCustomer(Customer customer) {
    }

    public void deleteCustomer(int id) {
    }
}
