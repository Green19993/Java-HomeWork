package appline.task;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int x = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int y = scanner.nextInt();

        System.out.println("Введите арифметическую операцию: ");
        char znak = scanner.next().charAt(0); // Считываем арифметическое действие

        switch (znak){
            case '+':
                System.out.println("Сумма чисел равна: " + (x+y));
                break;
            case '-':
                System.out.println("Разность x и y равна: " + (x-y));
                break;
            case '/':
                System.out.println("Деление x на y равно: " + (x/y));
                break;
            case '*':
                System.out.println("Произведение чисел равно: " + (x*y));
                break;
            default:
                System.out.println("Арифметическая операция введена неверно!!!");
        }
    }
}