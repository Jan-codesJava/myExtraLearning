package Day4;

import java.util.Random;

public class TAsk3 {
    public static void main(String[] args) {
        //Заполнить многомерный массив (матрицу) случайными числами от 0 до 50
        //размер матрицы задать m =12 , n= 8 (m - строки, n - колонки)
        //в консоль вывести индекс строки , сумма чисел в которой максимальна
        // если таких строк несколько , вывести последнюю из них
        // пример сгенерированной матрицы
        //32157       //18
        //12562       //16
        //34964       //26

        int [][] matrix = new int[12][8];

        Random random = new Random();

        for (int i =0; i < matrix.length; i++){
            for(int j =0; j<matrix[i].length;j++){
                matrix[i][j] = random.nextInt(50);

            }
        }

        int maxSum = 0;
        int maxSumIndex= 0;
        for (int i = 0; i < matrix.length; i++){
            int sum = 0;
            for (int j =0; j < matrix[i].length; j ++){
                sum += matrix[i][j];
            }

            if(sum >= maxSum){
                maxSum = sum;
                maxSumIndex = i;

            }
        }

        System.out.println(maxSumIndex);
    }
}
