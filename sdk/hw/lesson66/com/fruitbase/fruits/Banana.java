package hw.lesson66.com.fruitbase.fruits;

import hw.lesson66.com.fruitbase.Fruit;

import java.math.BigDecimal;

public class Banana extends Fruit {
    public Banana() {
        weight = 20;
        price = new BigDecimal("220.44");
        name = "Banana";
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
