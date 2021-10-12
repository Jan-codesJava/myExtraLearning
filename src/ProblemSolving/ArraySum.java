package ProblemSolving;

public class ArraySum {

    public static void main(String[] args) {

    }

    static int simpleArraySum(int[] ar){

        int ar_sum =0;

       // [1,2,3]

        for (int i = 0; i<ar.length; i++){
            ar_sum += ar[i];
        }
        return  ar_sum;
    }
}
