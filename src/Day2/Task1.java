package Day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

       /* using scanner, create a program , которая принимает на вход через консоль число,
        соответствуюшее количеству этажей в здании. используя оператор if , необходимо вывести в консоль сообщение о типе такого дома


        Условия: если этажей  1-4 - малоэтажный дом
        5-8 среднеэтажный
        9 и более - многоэтажный
        отрицательное значение- false
        */

        Scanner scanner = new Scanner(System.in);

        int floorCount = scanner.nextInt();

        if (floorCount>=1 && floorCount <=4) {
            System.out.println("Малоэтажный дом");
        } else if (floorCount >=5 && floorCount <=8) {
            System.out.println("Middle");
        }else if (floorCount >= 9) {
            System.out.println(" многоэтажный дом");
        } else{
            System.out.println("false");
        }
    }

}
