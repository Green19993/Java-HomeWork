package appline.task;
/*
Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
 */

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Создание матрицы:
        System.out.println("Введите количество строк в матрице: ");
        int str = scanner.nextInt();
        System.out.println("Введите количество столбцов в матрице: ");
        int stl = scanner.nextInt();
        int[][] array = new int[str][stl];

        // Заполнение матрицы:
        for (int i = 0; i < str; i++){
            for (int j = 0; j < stl; j++){
                System.out.println("Введите значение для индекса [" + (i+1) + "][" + (j+1) + "]");
                array[i][j] = scanner.nextInt();
            }
        }

        // Вывод матрицы (для удобства отслеживания):
        System.out.println(Arrays.deepToString(array));

        // Вывод новой первой строки:
        for (int i = 0; i < stl; i++){
            System.out.print((array[0][i] * 3) + " ");
        }
    }
}
