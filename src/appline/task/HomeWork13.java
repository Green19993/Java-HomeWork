package appline.task;
/*
Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:

    Выведите слова, состоящие только из латиницы.

    Выведите количество этих слов.
 */
import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();

        // Преобразовываем строку в массив строк:
        String [] str1 = str.split( " ");
        // Создадим счётчик:
        int count = 0;

        // Создадим правило на наличие только латинских букв:
        String paternFormat = "[a-zA-Z]*";

        // Перебираем каждую строку и выводим её при выполнении условий:
        for (String str2: str1){
            if (str2.matches(paternFormat)) {
                System.out.println(str2);
                count++;
            }
        }
        // Счётчик слов:
        System.out.println("Количество слов: " + count);
        scanner.close();
    }
}