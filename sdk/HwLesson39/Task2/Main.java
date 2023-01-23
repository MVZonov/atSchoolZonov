package HwLesson39.Task2;
public class Main {

//    Сделать класс с методом main, в методе объявить переменные а и b типа int , переменные x, y, z типа double. Вызовите созданные методы класса Summa, используя объявленные переменные.
//    Полученные результаты вывести на экран.
public static void main(String[] args) {
    int a = 1, b=2,c=3;
    double x = 1.1, y = 2.2, z = 3.3;
    Summa summa = new Summa();
    System.out.println(summa.sum(a, b));
    System.out.println(summa.sum(a, b, c));
    System.out.println(summa.sum(x, y));
    System.out.println(summa.sum(x, y, z));
    System.out.println(summa.sum(a, x, y));
}
}
