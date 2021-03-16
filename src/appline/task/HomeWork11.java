package appline.task;
/*
Напишите программу:

    Ввести первое  число с клавиатуры и записать его в строковую переменную.

    Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.

    Сравнить 2 числа и вывести большее на экран .

    Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
 */

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");

        // Считываем и сразу сохраняем в String:
        String num1 = Integer.toString(scanner.nextInt());

        // Считываем второе число и сохраняем его целочисленную часть:
        System.out.println("Введите второе число: ");
        int num2 = (int)(scanner.nextDouble());

        // Преобразовываем String в int:
        int num3 = Integer.parseInt(num1);

        // Вычисление большего числа:
        int res1 = Math.max(num3, num2);

        // Вычисление меньшего числа + преобразование в double:
        double res2 = Math.min(num3, num2);

        // Вывод результата:
        System.out.println("Большее значение = " + res1 + "\n" +
                "Меньшее значение = " + res2);
    scanner.close();
    }
}
