package appline.task;
/*
Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.  Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’. Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке. Нужно найти неизвестное.

Пример для теста работы программы:

    Ввод: x+5=7
    Вывод: 2
    Ввод: 3-x=9
    Вывод: -6
    Ввод: 3-3=x
    Вывод: 0
 */
import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String str = scanner.nextLine();
        scanner.close();

        // Вычисляем знак в уравнении:
        char znak = str.charAt(1);

        // Нахождение позиции х:
        int index = str.indexOf('x');

        // Условие для вызова нужного метода:
        if (znak == '+') {
            plus(str, index);
        } else
            if (znak == '-') {
            minus(str, index);
        } else System.out.println("Некорректный знак!");
    }

    // Класс для уравнения суммы:
    private static void plus(String str,int index){
        int a,b,c;
        switch (index) {
            case 0:
                b = Character.getNumericValue(str.charAt(2));
                c = Character.getNumericValue(str.charAt(4));
                System.out.println(c - b);
                break;
            case 2:
                a = Character.getNumericValue(str.charAt(0));
                c = Character.getNumericValue(str.charAt(4));
                System.out.println(c - a);
                break;
            case 4:
                a = Character.getNumericValue(str.charAt(0));
                b = Character.getNumericValue(str.charAt(2));
                System.out.println(a + b);
                break;
        }
    }

    // Класс для уравнения разности:
    private static void minus(String str,int index){
        int a,b,c;
        switch (index) {
            case 0:
                b = Character.getNumericValue(str.charAt(2));
                c = Character.getNumericValue(str.charAt(4));
                System.out.println(c + b);
                break;
            case 2:
                a = Character.getNumericValue(str.charAt(0));
                c = Character.getNumericValue(str.charAt(4));
                System.out.println(-(a - c));
                break;
            case 4:
                a = Character.getNumericValue(str.charAt(0));
                b = Character.getNumericValue(str.charAt(2));
                System.out.println(a - b);
                break;
        }
    }
}