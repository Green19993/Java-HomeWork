package appline.task;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите x: ");
        int x = scanner.nextInt();

        System.out.println("Введите y: ");
        int y = scanner.nextInt();

        System.out.println("Введите z: ");
        int z = scanner.nextInt();

        double count = 3; // Количество чисел. Указываем в double для точного значения
        double sred = (x + y + z)/count;
        System.out.println("Среднее арифметическое = " + sred);

        double sred1 = sred/2; // Делим среднее значение на 2
        int sred2 = (int) sred1; // Округляем в меньшую сторону
        System.out.println("После деления на 2 и округления получаем: " + sred2);

        if (sred2 > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
