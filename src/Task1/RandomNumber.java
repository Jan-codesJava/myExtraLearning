package Task1;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        /*Random number can be generated using two ways.
        java.util.Random class is used to generate random numbers of different data types such as
        boolean, int, long, float, and double. An object of Random class is initialized and the method nextInt(),
        nextDouble() or nextLong() is used to generate random number. You can also use Math.Random to
        generate random value between 0.0 and 1.0.
         */


       /*  Let’s look at how to generate 10 random numbers in Java –

        Example: Using Java Random Class
        First, we will see the implementation using java.util.Random – Assume we need to generate
        10 digit random number in Java between 0 to 100.
        */


             /*   Random objGenerator = new Random();
                for (int iCount = 0; iCount< 10; iCount++){
                    int randomNumber = objGenerator.nextInt(100);
                    System.out.println("Random No : " + randomNumber);
                }
            }
        }

              */
       /* Output:

        Random No : 17
        Random No : 57
        Random No : 73
        Random No : 48
        Random No : 68
        Random No : 86
        Random No : 34
        Random No : 97
        Random No : 73
        Random No : 18
        An object of Random class is initialized as objGenerator.
        The random number generator in Java class has a method as nextInt.
        This will provide a random number based on the argument specified as the upper limit,
                whereas it takes lower limit is 0.Thus, we get 10 random numbers displayed.

                Example: Using Java Math.Random
        Now, if we want 10 random numbers generated java but in the range of 0.0 to 1.0,
            then we should make use of random number generator Java class called math.random() .

        */

/*
                for(int xCount = 0; xCount< 10; xCount++){
                    System.out.println(Math.random());
                }
            }
        }

 */


       /* Output:

        0.46518450373334297
        0.14859851177803485
        0.5628391820492477
        0.6323378498048606
        0.1740198445692248
        0.9140544122258946
        0.9167350036262347
        0.49251219841030147
        0.7426056725722353
        Now, you know how those strange numbers are generated!!!

                Summary:
        Random number can be generated using two ways. You can use Random Java class (in package java.util) or Using Math.random Java class (however this will generate double in the range of 0.0 to 1.0 and not integers).


    }
}


        */

    }
}
