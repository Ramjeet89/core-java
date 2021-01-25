package interview_coding;

public class MoveAllZeroToEnd {

    static void moveallZerotoEnd(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < num) {
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 6, 0, 7, 0, 1, 6, 4, 2, 9, 1, 0, 3, 0, 0};
        int n = array.length;
        moveallZerotoEnd(array, n);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
