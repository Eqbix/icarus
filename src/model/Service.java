package model;

public class Service {
    private String serviceId; // Уникальный идентификатор услуги
    private String description; // Описание услуги
    private double price; // Цена услуги

    public Service(String serviceId, String description, double price) {
        this.serviceId = serviceId;
        this.description = description;
        this.price = price;
    }

    // Геттеры и сеттеры
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
