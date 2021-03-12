package appline.task;
/*
Напишите программу:

    Пользователь вводит размер массива и данные с клавиатуры в массив типа double.

    Посчитайте среднее арифметическое элементов массива.

    После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
 */
import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Делаем запрос на размер массива и его заполнения:
        System.out.println("Введите длину массива: ");
        int l = scanner.nextInt();
        double[] array = new double[l];

        // Заполнение массива:
        for (int i = 0; i < array.length; i++){
            System.out.println("Введите " + (i+1) + " элемент массива: ");
            array[i] = scanner.nextDouble();
        }

        // Вычисление среднего арифмитического:
        double sred = 0;
        for (int i = 0; i < array.length; i++){
            sred += (array[i]/array.length);
        }
        System.out.println("Среднее арифметическое = " + sred);

        // Вывод нового массива, перемноженного на среднее арифметическое:
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.2f", (array[i] * sred)); // Для компактности обрезаю 2 знака после запятой
            System.out.println();
        }
    }
}
