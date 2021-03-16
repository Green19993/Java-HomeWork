package appline.task;

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
