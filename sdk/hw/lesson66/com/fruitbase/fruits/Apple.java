package hw.lesson66.com.fruitbase.fruits;

import hw.lesson66.com.fruitbase.Fruit;

import java.math.BigDecimal;

public class Apple extends Fruit {
    public Apple() {
        weight = 12;
        price = new BigDecimal("123.44");
        name = "Apple";
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
