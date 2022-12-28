package HWLesson19Part2Cars.ru.pflb.vehicles;

import HWLesson19Part2Cars.ru.pflb.details.Engine;
import HWLesson19Part2Cars.ru.pflb.professions.Driver;

public class Car {
    private String model;
    private VehicleClass vehicleClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public String getModel() {
        return model;
    }

    public VehicleClass getVehicleClass() {
        return vehicleClass;
    }

    public int getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car(String model, VehicleClass vehicleClass, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.vehicleClass = vehicleClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Модель: " + model + "\n" +
                "Класс: " + vehicleClass + "\n" + "Характеристики:\n" +
                "Вес(кг): " + weight + "\n" +
                "Двигатель: " + engine + "\n" +
                "Водитель: " + driver + "\n\n";
    }
}
