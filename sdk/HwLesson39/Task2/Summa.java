package HwLesson39.Task2;

/*Создать класс Summa, в нем cоздать и перегрузить метод sum
- возвращающий сумму int от 2х переменных int
- возвращающий сумму double от 3х переменных int
- возвращающий сумму double от 2х и от 3х переменных double
- возвращающий сумму double от 1 int и от 2х переменных double
- возвращающий double из 2х переменных типа Integer*/
public class Summa {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(int a, int b, int c) {
        return a + b + c;
    }

    public double sum(double x, double y) {
        return x + y;
    }

    public double sum(double x, double y, double z) {
        return x + y + z;
    }

    public double sum(int a, double x, double y) {
        return a + x + y;
    }

    public double sum(Integer a, Integer b) {
        return a + b;
    }
}
