package sort;

import java.util.Arrays;

/**
 * Быстрая сортировка.
 */
public class QSort {

    private static int steps = 0;

    public static void main(String[] args) {

        final int[] arr = new int[]{9, 7, 6, 1, 5, 2, 3, 4, 8};
        qsort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(steps);
    }

    public static void qsort(final int[] arr) {
        qsort(arr, 0, arr.length);
    }

    public static void qsort(final int[] arr, final int beginIndex, final int endIndex) {
        final int len = endIndex - beginIndex;
        if(len == 1) {
            return;
        }

        final int elem = arr[beginIndex + (len / 2)];
        int elemCount = 0;
        final int[] less = new int[len];
        int lessIndex = 0;
        final int[] larger = new int[len];
        int largerIndex = 0;

        for (int i = beginIndex; i < endIndex; i++) {
            steps++;
            int n = arr[i];
            if(n < elem) {
                less[lessIndex++] = n;
            } else if (n == elem) {
                elemCount++;
            } else {
                larger[largerIndex++] = n;
            }
        }

        if (lessIndex > 0) {
            System.arraycopy(less, 0, arr, beginIndex, lessIndex);
            qsort(arr, beginIndex, beginIndex + lessIndex);
        }

        for (int i = 0; i < elemCount; i++) {
            arr[beginIndex + lessIndex + i] = elem;
        }

        if (largerIndex > 0){
            System.arraycopy(larger, 0, arr, elemCount + beginIndex + lessIndex, largerIndex);
            qsort(arr, elemCount + beginIndex + lessIndex, endIndex);
        }
    }
}
