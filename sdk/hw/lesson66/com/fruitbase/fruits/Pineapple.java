package hw.lesson66.com.fruitbase.fruits;

import hw.lesson66.com.fruitbase.Fruit;

import java.math.BigDecimal;

public class Pineapple extends Fruit {
    public Pineapple(double weight, BigDecimal price) {
        this.weight = weight;
        this.price = price;
        name = "Pineapple";
    }
}
