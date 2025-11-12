package week2;

public class Utility {
    public static int[] generateRandomArray(int size, int min, int max) {
        java.util.Random random = new java.util.Random();
        int[] array = new int[size]; 

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min; 
        }

        return array; 
    }
}
