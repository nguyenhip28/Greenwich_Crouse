package week1;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        //1. Declare an array
        int x;
        x = 5; //assignment statement   
        double y = 5.7; //declaration and initilization statement
        // initialization is an assignment at the first time
        
        //Solution 1 -------------
        int[] arr;
        arr = new int[5]; //initialize the array with 5 elements
        //Length of array is 5 ~ the array can store a total of 5 elements
        //Elements have default value of 0
        boolean[] brr = new boolean[5]; //default values are false
        //Solution 2 -------------
        int[] crr = {4, 9, 12, 5, -2, 2, 4, 8, 0, 1};
        int[] drr = new int[]{4, 9, 12, 5, -2, 2, 4, 8, 0, 1};

        //2. Access elements in array
        System.out.println(x);
        System.out.println(drr.length); //10
        // Elements in array are accessed by index 
        // Index: the position of the element in the array
        // Index: 0 -> (Length - 1)
        System.out.println("First element of 'drr': " + drr[0]);    
        System.out.println("Last element of 'drr': " + drr[drr.length - 1]);

        //drr.length = 15;//
        // Length of array is fixed after initialization
        // ***Expand the array??? <length of the array will be changed>

       // System.out.println(drr[10]); //Error: ArrayIndexOutOfBoundsException
       // System.out.println(drr[drr.length+1]);

        System.out.println("Hello World");

        //3. Application
        //3.1. Print all elements in the array
        System.out.println(Arrays.toString(arr));

        // StringBuilder sp = new StringBuilder();
        // for(int i = 0; i < drr.length; i++){
        //    sp.append(drr[i] + " ");
        // }
        // sp.toString();
        //3.2. Find the sum of all elements in the array
        int sum = 0;
        for(int i = 0; i < drr.length; i++){
            sum = sum + drr[i];
        }
        //
        sum=0;
        for(int each:drr){
            sum = sum + each;
        }
        System.out.println("Sum of all elements in 'drr': " + sum);
    }
}
