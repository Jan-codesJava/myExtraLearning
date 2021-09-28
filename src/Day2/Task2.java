package Day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /* two numbers a and b
        вывести все числа из диапазона между а и b, которые делятся на 5 без остатка,
         но при этом не делятся на 10 без остатака
         15 : 5
         15 : 10 !=0

         20 не подходит под наще условие
         */
        //input 7 78
        //output 15 25 35 45 55 65 75

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for(int i = a+1; i <b; i++){
            if (i % 5 == 0 && i % 10 !=0){
                System.out.println(i+ " ");
            }

        }

    }
}
