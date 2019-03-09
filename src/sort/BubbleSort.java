package sort;

import java.util.Arrays;

/**
 * Пузырьковая сортировка.
 */
public class BubbleSort {
    static int steps = 0;

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 4, 3, 9, 1, 6, 5};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(steps);
    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true;
            for (int j = 1; j < arr.length - i; j++) {
                int a = arr[j - 1];
                int b = arr[j];
                steps++;

                if(a > b) {
                    isSorted = false;
                    arr[j - 1] = b;
                    arr[j] = a;
                }

            }
            if(isSorted) {
                break;
            }
        }
    }
}
