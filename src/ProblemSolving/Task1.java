package ProblemSolving;

public class Task1 {
    /* given a square matrix , calculate the absolute difference between the sums of its diagonals
 123
 456
 989

 1+5+9  = 15
 3+5+9 = 17
 absolute difference = -2
     */

    public static void main(String[] args) {

    }
    static int diagonalDifference(int[][] arr){

        int left_to_right = 0;
        int right_to_left = 0;

        int rows = arr.length;
        int columns = arr[0].length;

        int i = 0;
        int j = 0;
        int k = 0;
        int l = arr.length - 1;

        while( i<rows && j< columns && k < rows && l>=0){
            left_to_right += arr[i][j];
            right_to_left += arr[k][l];
            i += l;
            j += l;
            k += l;
            l += l;
        }
        return  Math.abs(left_to_right - right_to_left);
    }

}
