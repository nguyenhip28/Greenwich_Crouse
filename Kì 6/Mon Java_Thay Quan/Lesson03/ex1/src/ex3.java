public class ex3 {
    public static void main(String[] args) {
        int[] arr = {9, -7, 10, 2, 6, 11, 15, 8, 4, -2};
        int key = 11;
        boolean found = search(arr, key);
        System.out.println("is" + key + "found? " + found);
    }
    private static boolean searchRecur(int[] arr , int key, int start, int end) 
    {
        return ((arr[end] == key) || searchRecur(arr, key, start, -1)
    }
    private static boolean search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
}
