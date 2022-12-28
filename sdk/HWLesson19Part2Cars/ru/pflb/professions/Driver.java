package HWLesson19Part2Cars.ru.pflb.professions;

import HWLesson19Part2Cars.ru.pflb.Person;


public class Driver extends Person {

    int drivingExperience;
    int licenseId;

    public Driver(String name, int age, int drivingExperience, int licenseId) {
        super(name, age);
        this.drivingExperience = drivingExperience;
        this.licenseId = licenseId;
    }

    @Override
    public String toString() {
        return getName() + "\n" +
                "- возраст: " + getAge() + "\n" +
                "- стаж: " + drivingExperience + "\n" +
                "- № удостоверения: " + licenseId;
    }

}

