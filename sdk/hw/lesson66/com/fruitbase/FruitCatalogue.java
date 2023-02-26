package hw.lesson66.com.fruitbase;

import hw.lesson66.com.fruitbase.fruits.Apple;
import hw.lesson66.com.fruitbase.fruits.Banana;
import hw.lesson66.com.fruitbase.fruits.Orange;
import hw.lesson66.com.fruitbase.fruits.Pineapple;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FruitCatalogue {
    //    содержит поле массив Fruit - список записей известных фруктов
//    содержит конструктор без параметров
//        при создании во внутренний массив добавляются записи-экзмепляры известных фруктов
//    содержит метод findFruit, доступный только в пакете
//        по переданному слову проверяет есть ли информация о таком фрукте
//        если есть, то возвращает Fruit. Если нет, то возвращает null.
    List<Fruit> fruits;

    public FruitCatalogue() {
        fruits = Arrays.asList(new Apple(), new Orange(), new Banana(), new Pineapple());
    }

    public Fruit findFruit(String yourFruit) {
        for (int i = 0; i < fruits.size(); i++) {
            if (yourFruit.equals(fruits.get(i).getName())) {
                return fruits.get(i);
            }
        }
        return null;
    }
}