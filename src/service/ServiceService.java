package service;

import model.Service;
import java.util.ArrayList;
import java.util.List;

public class ServiceService {
    private List<Service> services;

    public ServiceService() {
        this.services = new ArrayList<>();
    }

    public void addService(Service service) {
        services.add(service);
    }

    public void removeService(String serviceId) {
        services.removeIf(service -> service.getServiceId().equals(serviceId));
    }

    public List<Service> getAllServices() {
        return services;
    }

    public Service findServiceById(String serviceId) {
        return services.stream()
                .filter(service -> service.getServiceId().equals(serviceId))
                .findFirst()
                .orElse(null);
    }
}
