package appline.task;
/*
Напишите программу, где пользователь вводит любое целое положительное число n.
А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
 */
import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое положительное число: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++){
            if (i%2 != 0){
                sum += i;
            }
        }

        System.out.println("Сумма нечётных чисел от 1 до " + n +" равна " + sum );
    }
}
