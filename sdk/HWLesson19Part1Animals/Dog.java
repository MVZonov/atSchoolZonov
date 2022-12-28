package HWLesson19Part1Animals;

public class Dog extends Animal {
    public Dog(String name, String food, int foodCounter, String location, int counter, HealthState state) {
        super(name, food, foodCounter, location, counter, state);
    }


    @Override
    public void eat(int feed) {
        this.foodCounter -= feed;
        System.out.println("Собака ест " + food + ", Остаток еды: " + foodCounter + "." + "\n");
    }

    @Override
    public void makeSound() {
        System.out.println("Собачка говорит гав!" + "\n");
    }

    @Override
    public String toString() {
        return "Вид: Собака," + "\n" +
                "Кличка: " + name + ",\n" +
                "Страна обитания: " + location + ",\n" +
                "Состояние здоровья: " + state.getHealth() + ",\n" +
                "Сколько особей: " + counter + "\n";
    }
}
