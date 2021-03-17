package appline.task;
/*
Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”. Ответ: “Заархивированный вирус”.

    У пользователя есть 3 попытки, чтобы отгадать загадку.

    Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.

    Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.

    Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.

    Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны. Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку. Если на 2 и 3, вывести “Подсказка уже недоступна”.

    Если пользователь, использовавший подсказку, ошибется,
    вывести “Обидно, приходи в другой раз” и завершить работу.
 */
import java.util.Scanner;

public class FinalTask4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Количество попыток:
        int life = 3;
        System.out.println("Загадка: \nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает. \n" +
                "Нужна подсказка? (введите 'Подсказка'. Она доступна только при первой попытке) Либо введите ответ:");

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
                        System.out.println("Подсказка уже недоступна \nВведите ответ:");
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
                        System.out.println("Подумай еще! \nВведи ответ ещё раз:");
                        life--;
                        break;
                    }
            }
        } while (life > 0);
        scanner.close();
    }
}


