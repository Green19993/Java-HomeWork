package appline.task;
/*
Напишите программу:

    Пользователь вводит размер массива и данные с клавиатуры в массив

    Сравнить элементы массива с заранее заданными константами x, y, z.

    Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
 */

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Делаем запрос на размер массива и его заполнения:
        System.out.println("Введите длину массива: ");
        int l = scanner.nextInt();
        int[] array = new int[l];

        // Заполнение массива:
        for (int i = 0; i < array.length; i++){
            System.out.println("Введите " + (i+1) + " элемент массива: ");
            array[i] = scanner.nextInt();
        }

        // Сравнение элементов:
        for (int i = 0; i < array.length; i++) {
            compare(array[i]);
        }
    }

    private static void compare(int z) {

        // Задаём константы:
        int a = 3;
        int b = 6;
        int c = 9;

        // Сравниваем значения с константами:
        if (z == a || z == b || z == c){
            System.out.println("Значение '" + z + "' имеется в константах");
        }
    }
}
