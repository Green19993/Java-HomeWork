package appline.task;
/*
Выполните следующие действия с массивом:

    Задайте массив из 5 любых целых чисел.
    Поменяйте местами первый и последний элемент в массиве.
    Вывести в консоль результат суммы первого и среднего элемента.

Примечание : Для получения последнего и среднего элементов в массиве используйте свойство length.
 */

public class HomeWork3 {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        int b = array[array.length-1];
        array[array.length-1] = array[0];
        array[0] = b;
        System.out.println(array[0] + array[(array.length - 1)/2]);
    }
}
