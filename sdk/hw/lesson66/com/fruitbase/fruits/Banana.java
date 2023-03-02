package hw.lesson66.com.fruitbase.fruits;

import hw.lesson66.com.fruitbase.Fruit;

import java.math.BigDecimal;

public class Banana extends Fruit {
    public Banana(double weight, BigDecimal price) {
        this.weight = weight;
        this.price = price;
        name = "Banana";
    }
}
