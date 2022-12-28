package HWLesson19Part2Cars.ru.pflb.vehicles;

import HWLesson19Part2Cars.ru.pflb.details.Engine;
import HWLesson19Part2Cars.ru.pflb.professions.Driver;

public class Lorry extends Car {
    LoadingAmount loadingAmount;

    public Lorry(String model, VehicleClass vehicleClass, int weight, Driver driver, Engine engine, LoadingAmount loadingAmount) {
        super(model, vehicleClass, weight, driver, engine);
        this.loadingAmount = loadingAmount;
    }

    @Override
    public String toString() {
        return "Модель: " + getModel() + "\n" +
                "Класс: " + getVehicleClass() + "\n" + "Характеристики:\n" +
                "Вес(кг): " + getWeight() + "\n" +
                "Грузоподъемность(кг): " + loadingAmount + "\n" +
                "Двигатель: " + getEngine() + "\n" +
                "Водитель: " + getDriver() + "\n\n";
    }
}
