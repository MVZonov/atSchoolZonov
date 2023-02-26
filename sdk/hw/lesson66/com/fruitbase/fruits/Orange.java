package hw.lesson66.com.fruitbase.fruits;

import hw.lesson66.com.fruitbase.Fruit;

import java.math.BigDecimal;

public class Orange extends Fruit {
    public Orange() {
        weight = 14;
        price = new BigDecimal("120.44");
        name = "Orange";
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
