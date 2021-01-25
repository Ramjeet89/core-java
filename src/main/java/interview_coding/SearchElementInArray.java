package interview_coding;

import java.util.Arrays;

public class SearchElementInArray {

    private static void searchElement(int[] arr, int n) {
        boolean test = false;
        for (int element : arr) {
            if (element == n) {
                test = true;
                break;
            }
        }
        System.out.println("Is " + n + " present in the array: " + test);
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 1, 9, 7, 2, 6, 10};
        int n = 7;
        System.out.println("Array: " + Arrays.toString(arr));
        searchElement(arr, n);
    }
}