package hw.lesson66.com.fruitbase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cargo {
//    содержит поле массив Fruit - записи о фруктах, добавленных в груз
//    содержит консткрутор без параметров
//    в нем инициализируется внутренний массив

    List<Fruit> fruits;

    public Cargo() {
        fruits = new ArrayList<>();
    }

    //    addFruit, доступный только в пакете - добавляет Fruit во внутренний массив
    void addFruit(Fruit yourFruit) {
        fruits.add(yourFruit);
    }

    //    getWeight - возвращает суммарный вес груза
    public double getWeight() {
        double totalWeight = 0;
        for (int i = 0; i < fruits.size(); i++) {
            totalWeight += fruits.get(i).getWeight();
        }
        return totalWeight;
    }

    //    содержит общедоступный метод getPrice - возвращает суммарную цену груза
    public BigDecimal getPrice() {
        BigDecimal totalPrice = new BigDecimal("0");
        for (int i = 0; i < fruits.size(); i++) {
            totalPrice = totalPrice.add(fruits.get(i).getPrice());
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < fruits.size(); i++) {
            result += fruits.get(i) + "\n";
        }
        return "Заказ: " + "\n" +
                result +
                "Общая цена: " + getPrice() + "\n" +
                "Общий вес груза: " + getWeight();
    }
}



