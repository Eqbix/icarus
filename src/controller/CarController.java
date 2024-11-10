package controller;

import model.Car;
import service.CarService;

import java.util.List;

public class CarController {
    private CarService carService;

    public CarController() {
        this.carService = new CarService();
    }

    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    public void addCar(Car car) {
        carService.addCar(car);
    }

    public void updateCar(Car car) {
        carService.updateCar(car);
    }

    public void deleteCar(int id) {
        carService.deleteCar(id);
    }
}
