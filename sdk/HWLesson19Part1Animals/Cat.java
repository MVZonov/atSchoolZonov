package HWLesson19Part1Animals;

public class Cat extends Animal {
    public Cat(String name, String food, int foodCounter, String location, int counter, HealthState state) {
        super(name, food, foodCounter, location, counter, state);
    }

    @Override
    public void eat(int feed) {
        this.foodCounter -= feed;
        System.out.println("Кошка ест " + food + ", Остаток еды: " + foodCounter + "." + "\n");
    }

    @Override
    public void makeSound() {
        System.out.println("Кошка говорит мяу!" + "\n");
    }

    @Override
    public String toString() {
        return "Вид: Кошка," + "\n" +
                "Кличка: " + name + ",\n" +
                "Страна обитания: " + location + ",\n" +
                "Состояние здоровья: " + state.getHealth() + ",\n" +
                "Сколько особей: " + counter + "\n";
    }
}
