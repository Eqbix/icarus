package model;

import java.util.Date;

public class Sale {
    private String saleId; // Уникальный идентификатор продажи
    private Car car; // Автомобиль, который продается
    private Customer customer; // Клиент, который покупает автомобиль
    private Date saleDate; // Дата продажи
    private double salePrice; // Цена продажи

    public Sale(String saleId, Car car, Customer customer, Date saleDate, double salePrice) {
        this.saleId = saleId;
        this.car = car;
        this.customer = customer;
        this.saleDate = saleDate;
        this.salePrice = salePrice;
    }

    // Геттеры и сеттеры
    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}
