import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] inputArr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(inputArr)); // [1, 2, 3, 4, 5]
        reverseArray(inputArr);
        System.out.println(Arrays.toString(inputArr));

    }

    public static void reverseArray(int[] target) {

        int start = 0;
        int end = target.length - 1;

        while (start < end) {
            int temp = target[start];
            target[start] = target[end];
            target[end] = temp;

            start++;
            end--;
        }
    }
}
