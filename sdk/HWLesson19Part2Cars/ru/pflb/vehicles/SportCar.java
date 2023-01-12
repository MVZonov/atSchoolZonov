package HWLesson19Part2Cars.ru.pflb.vehicles;

import HWLesson19Part2Cars.ru.pflb.Person;
import HWLesson19Part2Cars.ru.pflb.details.Engine;
import HWLesson19Part2Cars.ru.pflb.professions.Driver;

public class SportCar extends Car {
    int maxVelocity;

    public SportCar(String model, VehicleClass vehicleClass, int weight, Person driver, Engine engine, int maxVelocity) {
        super(model, vehicleClass, weight, driver, engine);
        this.maxVelocity = maxVelocity;
    }

    @Override
    public String toString() {
        return "Модель: " + getModel() + "\n" +
                "Класс: " + getVehicleClass() + "\n" + "Характеристики:\n" +
                "Вес(кг): " + getWeight() + "\n" +
                "Максималььная скорость(км/ч): " + maxVelocity + "\n" +
                "Двигатель: " + getEngine() + "\n" +
                "Водитель: " + getDriver() + "\n\n";
    }
}
