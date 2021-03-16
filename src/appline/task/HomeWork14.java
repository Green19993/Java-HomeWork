package appline.task;
/*
Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:

    Выведите максимальный и минимальный элемент массива.

    Из максимального и минимального значения выведите наибольшее по модулю.
 */
import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args) {

        // Создаём массив чисел:
        int[] mas = new int[15];

        // Указываем границы диапазона
        int min = -20;
        int max = 20;

        // Создаём параметры для определения максимального и минимального значения
        // При этом задаём им максимальное возможное значение:
        int maxInt = min;
        int minInt = max;

        // Заполняем массив рандомными числами из диапазона:
        for (int i = 0; i < mas.length; i++){
            mas[i] = min  + (int)(Math.random() * (max - min));

            // Для проверки выводим массив на экран:
            System.out.print(mas[i] + "  ");

            // Параллельно вычисляем наибольшее и наименьшее значение:
            minInt = Math.min(minInt,mas[i]);
            maxInt = Math.max(maxInt,mas[i]);
        }
        // Выводим минимальное и максимальное значение:
        System.out.println("\n\nМинимальное значение = " + minInt +
                "\nМаксимальное значение = " + maxInt);

        // Возьмём модуль чисел:
        int mod1 = Math.abs(minInt);
        int mod2 = Math.abs(maxInt);
        System.out.println("Наибольшее по модулю число = " +
                Math.max(mod1,mod2));
    }
}
