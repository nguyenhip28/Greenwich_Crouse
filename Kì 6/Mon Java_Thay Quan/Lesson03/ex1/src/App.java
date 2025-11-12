public class App {
    public static void main(String[] args){
        // 1. Implement liear search on array using recursive function
        // 2. Find max, min value in an array using recursive function
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    int idxMax = find(arr);
    System.out.println("Max value is: " + arr[idxMax] + " at index: " + idxMax);

    }
    private static int find(int[] arr){
        int idx = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > arr[idx]){
                idx = i;
            }
        }
        return idx;
    }
}

