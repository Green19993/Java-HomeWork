package appline.task;
/*
Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки. Среди данных строк найти строку с максимальным количеством различных символов. Если таких строк будет много, то вывести первую.

Пример для теста работы программы:

    Количество строк: 3
    Строка 1: привет
    Строка 2: анализ
    Строка 3: 111111111111
    Ответ: привет
 */
import java.util.Scanner;

public class FinalTask3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество строк: ");
        int n = scanner.nextInt();

        // Чтобы далее считывался nextLine нужно перейти на слудующую строку
        // Вычитал проблему здесь: https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        scanner.nextLine();

        // Массив строк:
        String[] str = new String[n];

        // Счётчик различных символов:
        int[] countList = new int[n];

        // Заполнение массива строк:
        for (int i = 0; i < n; i++){

            System.out.println("Строка " + (i+1) + ": ");
            str[i] = scanner.nextLine();
        }
        scanner.close();

        if (n > 1) {
            // Перебираем все строки:
            for (int i = 0; i < n; i++) {
                String strCounter = str[i];
                countList[i] = counter(strCounter);
            }
            // Находим строку с наибольшим количеством различных символов:
            int stroka = 0;
            int index = 0;
            for (int i = 0; i < n; i++){
                if (countList[index] < countList[i]){
                    index = i;
                }
            }
            System.out.println("Ответ: " + str[index]);

            // Если одна строка:
        } else System.out.println("Ответ: " + str[0]);

        // Вывод количетсва различных символов в строке:
        for (int i = 0; i < countList.length; i++){
            System.out.print(countList[i] + " ");
        }
    }

    // Метод вычисляет количество различных символов:
    private static int counter(String str){

        // Зададим счётчик и разобьём строку на символы:
        int num;
        if (str.length() == 0){
             num = 0;
        }else {
             num = 1;
        }
        String[] test = str.split("");
        for (int i = 0; i < (str.length() - 1); i++){

            // Сравниваем соседние символы и заменяем на все символы на второй (чтобы в дальнейшем счётчик не отработал):
            if (str.charAt(i) != str.charAt(i+1)){
                num++;
                str = str.replace(str.charAt(i), str.charAt(i+1));
            }
        }
        return(num);
    }
}
