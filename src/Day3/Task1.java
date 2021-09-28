package Day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /*
        creat program , которая в консоль выводит название страны , принимая на вход название города.
         Программа должна работать до тех пор , пока не будет введено слова "stop"

         Moscow, Vladivostok, Rostov - Russia
         Rome, Milan, Turin - Italy
         Berlin , Munich, Koln - Germany

         if other city - unknown country
         */

        Scanner scanner = new Scanner(System.in);

        while(true){
            String city = scanner.nextLine();

            if (city.equals("Stop"))
                break;
            switch (city){
                case "Moscow":
                case "Vladivostok":
                case "Rostov":
                    System.out.println("Russia");
                    break;
                case "Rome":
                case "Milan":
                case "Turin":
                    System.out.println("Italy");
                    break;
                case "Berlin":
                case "Munich":
                case "Koln":
                    System.out.println("Germany");
                    break;
                default:
                    System.out.println("Unknown country");
            }
        }
    }
}
