package appline.task;

import java.util.Scanner;

public class FinalTask4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Количество попыток:
        int life = 3;
        System.out.println("Загадка: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает. \n" +
                "Нужна подсказка (введите 'Подсказка'. Она доступна только при первой попытке)? Либо введите ответ:");

        do {
            String answer = scanner.nextLine();
            switch (answer) {
                // Правильный ответ:
                case "Заархивированный вирус":
                    System.out.println("Правильно!");
                    life = 0;
                    break;
                // Подсказка
                case "Подсказка":
                    // Подсказка при первой попытке
                    if (life != 3) {
                        System.out.println("Подсказка уже недоступна");
                        break;
                        // Подсказки при последующих попытках:
                    }else{
                        System.out.println("Два слова.Первое это файл после 7z или WinRar(прилагательное)," +
                                " второе похоже по значению на грипп.");
                        life = 1;
                        break;
                    }
                    //Неправильный ответ:
                default:
                    // Проигрыш:
                    if (life == 1){
                        System.out.println("Обидно, приходи в другой раз");
                        life --;
                        break;
                        // Неудачная попытка:
                    }else{
                        System.out.println("Подумай еще!");
                        life--;
                        break;
                    }
            }
        } while (life > 0);
        scanner.close();
    }
}


