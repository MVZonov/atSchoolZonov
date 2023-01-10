package HWLesson19Part1Animals;
import HWLesson19Part1Animals.Animal;
public class Vet {
    String vetName;

    public Vet(String vetName) {
        this.vetName = vetName;
    }
    
    void treatAnimal(Animal animal) {
        if (animal.state == HealthState.BAD) {
            animal.state = HealthState.GOOD;
            System.out.println("Ветеринарный врач " + vetName + " вылечил: " + animal.name + ", состояние здоровья животного: " + animal.state + "." + "\n");
        }
    }
}
