import java.util.Arrays;

public class BubbleSort {
    static int steps = 0;

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 4, 3, 9, 1, 6, 5};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                int a = arr[i];
                int b = arr[j];
                steps++;

                if(a > b) {
                    arr[i] = b;
                    arr[j] = a;
                }

            }
        }
    }
}
