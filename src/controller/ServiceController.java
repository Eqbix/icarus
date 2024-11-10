package controller;

import model.Service;
import service.ServiceService;

import java.util.List;

public class ServiceController {
    private ServiceService serviceService;

    public ServiceController() {
        this.serviceService = new ServiceService();
    }

    public List<Service> getAllServices() {
        return serviceService.getAllServices();
    }

    public void addService(Service service) {
        serviceService.addService(service);
    }

    public void updateService(Service service) {
        serviceService.updateService(service);
    }

    public void deleteService(int id) {
        serviceService.deleteService(id);
    }
}
