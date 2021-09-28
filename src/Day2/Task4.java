package Day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        //пользователь вводит число Х и мы должны высчетать число У
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y=0;

        if (x>=5) {
            y = (Math.pow(x, 2) - 10) / (x + 7);
        }else if (x > -3 && x<5) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
        } else{
            y = 420;
        }
        System.out.println(y);
    }
}
