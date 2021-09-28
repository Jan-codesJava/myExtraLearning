package BreakStatement;

public class BreakDance {
    public static void main(String[] args) {

        /*int i =0;

        while (i<3){
            System.out.println("Hi!");
         //   break;
            i++;

         */

     /*   int [] numbers = {10, 20, 30, 40, 50};

        for(int i = 0; i < numbers.length; i ++){

            if(numbers[i] == 30){
                break;
            }
            System.out.println(numbers[i]);
        }

      */

        //switch

      /*  int i = 1;
         switch (i){
             case 0:
                 System.out.println("Zero!");
                 break;
                 case 1:
                     System.out.println("One!");
                     break;
             default:
                 System.out.println("WTF man??");
                 break;

         }

       */

        //nested loop

        for(int i = 0; i < 5; i ++){

            for (int j =0; j<3; j++){
                System.out.println(i + ", " +j);
                break;
            }
        }
    }
}
