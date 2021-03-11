package appline.task;


public class HomeWork3 {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        int b = array[array.length-1];
        array[array.length-1] = array[0];
        array[0] = b;
        System.out.println(array[0] + array[(array.length - 1)/2]);
    }
}
