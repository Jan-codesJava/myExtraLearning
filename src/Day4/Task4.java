package Day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        /* создать и заролнить новый массив длиной 100 элементов, случайными числами от 0 до 10000ю
        найти максимум среди сумм трех соседних элементов
        для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента
         */
       // [1, 456, 1025, 65, 954, 5789, 4, 8742, 1040, 3254]
        //тройка с мак суммой : [5789, 4, 8742]

       // int[]array = {1, 456, 1025, 65, 954, 5789, 4, 8742, 1040, 3254};
        int[] array = new int[100];

        Random random = new Random();

        for( int i = 0; i < array.length; i ++)
        array[i] = random.nextInt(10000);

        int maxSum = 0;
        int maxSumIndex = 0;
        for(int i = 0; i< array.length - 2; i ++){
            int sum = 0;
            for(int j = i; j<i+3;  j++){
                sum += array[j];
            }

            if(sum > maxSum){
                maxSum = sum;
                maxSumIndex = i;
            }
        }

        System.out.println(maxSum);
        System.out.println(maxSumIndex);
    }


}
