package week1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
    //Given an array of integers
    // , find the average, max, min of the array
    public static void main(String[] args) {
        //int[] arr = {4, 9, 12, 5, -2, 2, 4, 8, 0, 1};
        int[] arr = new int[10];
        //Find the average of the array
        int sum = 0;
        int max = Integer.MIN_VALUE; // -2^31
        //int max = (int)Math.pow(-2, 31);
        int min = Integer.MAX_VALUE;
        double mx = Double.NEGATIVE_INFINITY;

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        for(int i = 0; i < arr.length; i++){
            //arr[i] = sc.nextInt(); //Input from the keyboard
            //arr[i] = rd.nextInt(21);//0->20
            arr[i] = rd.nextInt(26) - 5;//-5 -> 20
            sum = sum + arr[i];
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println("Array: " + Arrays.toString(arr));
        double average = (double)sum/arr.length;
        System.out.println("Average of the array: " + average);
        System.out.println("Max of the array: " + max);
        System.out.println("Min of the array: " + min);
        ///////////////////////////////////////////
        
    }
}
