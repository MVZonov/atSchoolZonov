package hw.lesson66.com.fruitbase;

public class FruitBase {
//        содержит поле FruitCatalogue
//        содержит конструктор без параметров
//        в нем инициализируется поле FruitCatalogue
//        содержит общедоступный метод для обработки заказа takeOrder
//        в этом методе происходит поиск слов из заказа в FruitCatalogue
//        если хотя бы одно название найдено, то формируется груз Cargo с информацией о найденных фруктах
//        Если среди запроса не встретились известные названия,
//                то возвращается груз Cargo с нулевым количеством фруктов
//        содержит метод main
//        здесь происходит выполнение программы согласно описанию выше
//        основные шаги:
//        создается фруктовая база
//        проверяется наличие заказа от пользователя
//        если есть заказ, то он передается в метод takeOrder
//        выводим результат
    FruitCatalogue catalogue;

    public FruitBase() {
        catalogue = new FruitCatalogue();
    }

    public Cargo takeOrder(String[] order) {
        Cargo cargo = new Cargo();
        for (int i = 0; i < order.length; i++) {
            Fruit fruit = catalogue.findFruit(order[i]);
            if (fruit != null) {
                cargo.addFruit(fruit);
            }
        }
        return cargo;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            FruitBase fruitBase = new FruitBase();
            System.out.println(fruitBase.takeOrder(args));
        } else {
            System.out.println("Нет введённых аргументов");
        }
    }
}
