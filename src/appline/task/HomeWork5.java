package appline.task;
/*
Напишите простой калькулятор:

    Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
    В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
 */
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
                if (y == 0){
                    System.out.println("Делить на ноль нельзя!");
                    break;
                }
                else
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
