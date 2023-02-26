package hw.lesson66.com.fruitbase.fruits;

import hw.lesson66.com.fruitbase.Fruit;

import java.math.BigDecimal;

public class Pineapple extends Fruit {
    public Pineapple() {
        weight = 3;
        price = new BigDecimal("20.44");
        name = "Pineapple";
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
