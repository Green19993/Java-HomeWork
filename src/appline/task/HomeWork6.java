package appline.task;

import java.util.Scanner;

public class HomeWork6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа позволяет конвентировать массу или расстояние");
        System.out.println("Выберите что будем переводить: Массу(введите 1) или Растояние(введите 2)");
        int x = scanner.nextInt(); // Что переводим

        switch (x) {
            case 1: {
                weight(scanner);
                break;
            }
            case 2: {
                distance(scanner);
                break;
            }
            default: {
                System.out.println("Введено некорректное значение!");
            }
        }
    }

    private static void weight(Scanner scanner) {
        System.out.println("Выберите единицу измерения: Килограмм(1), Грамм(2), Унция(3), Фунт(4)");
        int y, unit; //Единица измерения и количество
        y = scanner.nextInt();
        if (y>4 || y<0) {
            System.out.println("Некорректное значение!");
            return;
        }
        System.out.println("Введите количество единиц");
        unit = scanner.nextInt();
        switch (y){
            case 1:{
                System.out.println("Килограмм: " + unit + "\n" +
                        "Грамм: " + (unit * 1000) + "\n" + "Унция: " + (unit * 35.27396) + "\n" + "Фунт: " + (unit * 2.2046));
                break;
            }
            case 2:{
                System.out.println("Килограмм: " + (unit * 0.001) + "\n" +
                        "Грамм: " + unit + "\n" + "Унция: " + (unit * 0.03527) + "\n" + "Фунт: " + (unit * 0.002204));
            }
            case 3:{
                System.out.println("Килограмм: " + (unit * 0.028349) + "\n" +
                        "Грамм: " + (unit * 28.3495) + "\n" + "Унция: " + unit + "\n" + "Фунт: " + (unit * 0.0625));
                break;
            }
            case 4:{
                System.out.println("Килограмм: " + (unit * 0.45359) + "\n" +
                        "Грамм: " + (unit * 453.59237) + "\n" + "Унция: " + (unit * 16) + "\n" + "Фунт: " + unit);
                break;
            }
            default:{
                System.out.println("Единица измерения введена некорректно!");
            }
        }
    }

    private static void distance(Scanner scanner) {
        System.out.println("Выберите единицу измерения: Метр(1), Миля(2), Ярд(3), Фут(4)");
        int y, unit; //Единица измерения и количество
        y = scanner.nextInt();
        System.out.println("Введите количество единиц");
        unit = scanner.nextInt();

        switch (y){
            case 1:{
                System.out.println("Метры: " + unit + "\n" +
                        "Мили: " + (unit * 0.000621) + "\n" + "Ярды: " + (unit * 1.09361) + "\n" + "Футы: " + (unit * 3.280839));
                break;
            }
            case 2:{
                System.out.println("Метры: " + (unit * 1609.3439) + "\n" +
                        "Мили: " + unit + "\n" + "Ярды: " + (unit * 1760) + "\n" + "Футы: " + (unit * 5280));
                break;
            }
            case 3:{
                System.out.println("Метры: " + (unit * 0.9144) + "\n" +
                        "Мили: " + (unit * 0.0005681) + "\n" + "Ярды: " + unit + "\n" + "Футы: " + (unit * 3));
                break;
            }
            case 4:{
                System.out.println("Метры: " + (unit * 0.3048) + "\n" +
                        "Мили: " + (unit * 0.00018939) + "\n" + "Ярды: " + (unit * 0.3333) + "\n" + "Футы: " + unit);
                break;
            }
            default:{
                System.out.println("Единица измерения введена некорректно!");
            }
        }
    }
}


