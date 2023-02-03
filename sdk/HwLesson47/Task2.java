package HwLesson47;

public class Task2 {
    //    В бригаде, работающей на уборке сена, имеется n сенокосилок.
//    Первая сенокосилка работала m _часов_, а каждая следующая
//    на 10 _минут_ больше, чем предыдущая.
//    Напишите программу, вычисляющую количество сколько часов
//    проработала вся бригада.
//    Результат вычислений выведите на экран в часах и минутах.
//            Например, "Бригада работало 0 часов 30 минут".
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]); //часы
        int n = Integer.parseInt(args[1]); //сенокосилки
        int timeInSec = m * 3600;
        int tenMin = 600;
        int result = timeInSec;
        if (m < 0 || n < 0) {
            System.out.println("Одно или несколько введённых значений отрицательные.");
        } else {
            for (int i = 1; i < n; i++) {
                timeInSec = timeInSec + tenMin;
                result += timeInSec;
            }
            System.out.println("Бригада работала "+(result/3600) +  " часов "+ ((result%3600)/60) + " минут");
        }
    }
}
