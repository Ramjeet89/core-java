package interview_coding;

import java.util.Arrays;

public class ArraySortingWithPredefineMethod {

    public static void sortingMethod(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+", ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        System.out.println("Before sorting Element");
        System.out.println(Arrays.toString(arr));
        System.out.println("After sorting Element");
        sortingMethod(arr);

    }
}
