package com.company;

public class Switch {
    public static void main(String[] args) {

      //6
        int n = 0;
        int sum = 0;
        while (n <=6)
        {
            sum += n++;
        }
        System.out.println("sum = " + sum); //21

        //7
        int input = 0;
        int range = 10;
        while (input < range)
        {
            input = input + 1;
        }
        System.out.println(input);  //10

        //8

        int count = 1;
        while (count <=10)
        {
            count *=2;
        }
        count = count - 10;

    }

}
