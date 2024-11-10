package service;

import model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(String vin) {
        cars.removeIf(car -> car.getVin().equals(vin));
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public Car findCarByVin(String vin) {
        return cars.stream()
                .filter(car -> car.getVin().equals(vin))
                .findFirst()
                .orElse(null);
    }

    public void updateCar(Car car) {
    }

    public void deleteCar(int id) {

    }
}
