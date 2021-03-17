package appline.task;
/*
Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу. Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой. Пример для теста работы программы:

    Курс доллара: 67,55
    Количество рублей: 1000
    Итого: 14,80 долларов
 */
import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите курс доллара: ");
        double kurs = scanner.nextDouble();

        System.out.println("Введите количество рублей: ");
        double money = scanner.nextDouble();

        // Вызываем метод конвертации рублей в доллары:
        convertInDollar(kurs,money);

        scanner.close();
    }

    private static void convertInDollar(double kurs, double money){
        double result = money/kurs;
        System.out.print("Итого: ");
        System.out.printf("%.2f", result);
        System.out.println(" долларов");
    }
}
