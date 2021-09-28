package Day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // два числа : делимое и делитель

        Scanner scanner = new Scanner(System.in);

        while (true) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            //1 2
            if (b == 0)
                break;

                System.out.println(a/b);
            }
        }
    }

