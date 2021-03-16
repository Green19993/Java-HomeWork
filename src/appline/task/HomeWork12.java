package appline.task;
/*
Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:

    Проверить, содержит ли строка подстроку “Java” (используйте contains()).

    Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).

    Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).

    Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.

    Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()).
 */
import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Немного не понял первый пункт, поэтому реализую так:
        System.out.println("Введите: I like Java!!!");
        String str = scanner.nextLine();

        // Проверка наличия слова Java в строке:
        boolean res1 = str.contains("Java");

        // Проверка начала строки:
        boolean res2 = str.startsWith("I like");

        // Проверка окончания строки:
        boolean res3 = str.endsWith("!!!");

        // Проверка выполнения трёх условий:
        if (res1 && res2 && res3){
            //Преобразование строки к верхнему регистру:
            String str2 = str.toUpperCase();
            System.out.println(str2);
        }else System.out.println("Три условия не выполнены!");

        // Плохо описано задание. Понял так:
        // Вытищать из String слово Java (заранее зная индексы слова Java)
        String str2 = str.substring(7,11);
        // И после этого заменить 'a' на 'o':
        String str3 = str2.replace('a','o');
        System.out.println(str3);
    }
}
