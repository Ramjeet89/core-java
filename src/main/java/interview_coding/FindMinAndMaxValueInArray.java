package interview_coding;

public class FindMinAndMaxValueInArray {

    public int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        FindMinAndMaxValueInArray m = new FindMinAndMaxValueInArray();
        int[] myArrayr = {1, 2, 3, 65, 7, 32, 90, 77, 55, 34};
        System.out.println("Max Value: " + m.max(myArrayr));
        System.out.println("Min Value: " + m.min(myArrayr));
    }
}

