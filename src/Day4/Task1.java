package Day4;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        //создать и заполнить массив доиной 100 элементов, случайнымт числами от 0 до 10000
        //и с помощью цикла for each вывести инфо-ю о наибольшем и наименьшем элементе массива
        // кол-во элементов оканчивающихся на 0 , сумме элеме-в оканчивающихся на 0.
        // использовать сортировку запрешено

        int[] array = new int[100];

        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        int max = 0;
        //[1, 5, 6,10, -5, 15]
        for (int element : array) {
            if (element > max)
                max = element;
        }
        System.out.println(max);


        int min = 10000;

        //[ 50, 10, 100]
        for (int element : array) {
            if (element < min)
                min = element;
        }
        System.out.println(min);


        int counter = 0;
        for (int element : array) {
            if (element % 10 == 0)
                counter++;
        }
        System.out.println(counter);

        int sum = 0;
        for (int element : array) {
            if (element % 10 == 0)
                sum += element;
        }
        System.out.println(sum);
    }
}
