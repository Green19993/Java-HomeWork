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
        String str;

        // Проверка на длину уравнения:
        do {
            System.out.println("Введите уравнение: ");
            str = scanner.nextLine();
            if (str.length() != 5){
                System.out.println("Некорректный формат! " +
                        "\nНеобходимо ввести уравнение длиной 5 символов. Пример: 'a+b=c'");
            }
        } while (str.length()!=5);

        // Вычисляем знак в уравнении:
        char znak = str.charAt(1);

        // Нахождение позиции х(англ):
        int index = str.indexOf('x');
        // Либо если х(рус):
        if (index == -1) {
            index = str.indexOf('х');
        }
            // Условие для вызова нужного метода:
            if (znak == '+' && index != -1) {
                plus(str, index);
            } else if (znak == '-' && index != -1) {
                minus(str, index);
            } else System.out.println("Некорректный знак или уравнение!");

        scanner.close();
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