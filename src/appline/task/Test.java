package appline.task;

public class Test {
    public static void main(String[] args) {

        String str = "qwert";
        // Зададим счётчик и разобьём строку на символы:
        int num = 0;
        String[] test = str.split("");
        for (int i = 0; i < (str.length() - 1); i++){

            // Сравниваем соседние символы и заменяем на все символы на второй (чтобы в дальнейшем счётчик не отработал):
            if (str.charAt(i) != str.charAt(i+1)){
                num++;
                str = str.replace(str.charAt(i), str.charAt(i+1));
            }
        }
        System.out.println(num);
    }
}
