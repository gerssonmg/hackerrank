import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int sum = 6*6*(-10); //exemplo de menor limite
    public static int aux = 0;
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        for(int i = 0 ; i <= 3 ; i++){
            for(int j=0 ; j<= 3 ; j++){
                aux = 0;
                aux = arr[i][j];
                aux += arr[i][j+1];
                aux += arr[i][j+2];
                aux += arr[i+1][j+1];
                aux += arr[i+2][j];
                aux += arr[i+2][j+1];
                aux += arr[i+2][j+2];
                if(sum < aux) sum = aux;
                //System.out.println("aux:" + aux);   
            }
        }
        //System.out.println("sum:" + sum);
return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        scanner.close();
    }
}


