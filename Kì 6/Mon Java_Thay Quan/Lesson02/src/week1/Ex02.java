package week1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex02 {
    //1. Search
    //2. Arrange    
    //   2.1. Partitioning
    //   2.2. Reverse
    //   2.3. Sorting (asceeding, descending)
    //3. CRUD: Create, Read, Update, Delete

    public static void main(String[] args) {
        //1. Search
        //Given an array of integers, and an integer 'key'
        //Find the index of the key in the array
        int[] arr = new int[10];
        Random rd = new Random();
        for(int i=0; i<arr.length; i++){
            arr[i] = rd.nextInt(21) - 5;
        }
        System.out.println(Arrays.toString(arr));

        //Linear search
        System.out.print("Search for: ");
        int key = new Scanner(System.in).nextInt();
        //Display the first -> last occurrence of the key in the array
        //Display all occurrences of the key in the array
        boolean flag = false;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == key){
                System.out.println("Found at index: " + i);  
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println("Not found");
    }

}
