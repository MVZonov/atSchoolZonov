package hw.lesson66.com.fruitbase;

import java.math.BigDecimal;

public abstract class Fruit {
    /* Вес измеряется в кг и имеет тип double. Цена измеряется в у.е. и имеет тип BigDecimal
    содержит общедоступный метод по-умолчанию для получения значения веса getWeight
    содержит общедоступный метод по-умолчанию для получения значения цены getPrice
    содержит общедоступный метод по-умолчанию для получения значения цены getName
    */
    public double weight; //вес
    public BigDecimal price; //цена
    public String name; //название фрукта

    public double getWeight() {
        return weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Фрукт: " + name +
                ", вес: " + weight +
                ", цена: " + price ;
    }
}
