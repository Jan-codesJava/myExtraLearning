package Day1;

public class Task6 {
    public static void main(String[] args) {

        //tablissa umnojeniya
       /* output
1 x 7 = 7
2 x 7 = 14
3 x 7 = 21
4 x 7 = 28
5 x 7 = 35
6 x 7 = 42
7 x 7 = 49
8 x 7 = 56
9 x 7 = 63


        */
        int k = 7;

        for (int i =1; i<10; i++){
            System.out.println(i+ " x " + k + " = " + i * k);
        }
    }
}
