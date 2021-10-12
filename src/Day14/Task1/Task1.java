package Day14.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
создать txt  файл в папке проекта. заполнить его в ручную десятью произвольными числами.
реализовать программу которая считает сумму всех чисел в этом файле и выводит ее на экран
если файла не существует в папке проекта,  в программе необходимо выбрасывать исключение и выводить в консоль
сообщение "файл не найден"
если чисел в файле меньше или больше 10, необходимо выбрасывать исключение и выводить в консоль сообщение
"некорректный входной файл"
 */

public class Task1 {
    public static void main(String[] args) {

      /*  File file = new File("input.txt");

        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            if (numbers.length != 10);
            throw new IllegalArgumentException();

            int  sum = 0;
            for (String number : numbers){
               sum += Integer.parseInt(number);

                System.out.println(sum);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");

        } catch (IllegalArgumentException e){
            System.out.println("Nekorrektnyi vhodnoi file");
        }


       */
    }
}