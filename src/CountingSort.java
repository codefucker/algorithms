import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class CountingSort {

    public static void main(String[] args) {
        int max = 1000;
        int[] c = new int[max];
        int[] a = CountingSort.generator(max, 10_000);

        System.out.println("Before:\n");
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
        }

        int pos = 0;
        for (int i = 0; i < c.length; i++) {
            final int count = c[i];

            for (int j = 0; j < count; j++) {
                a[pos++] = i;
            }
        }

        System.out.println("After:\n");
        System.out.println(Arrays.toString(a));
    }

    public static int[] generator(final int max, final int len) {
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = ThreadLocalRandom.current().nextInt(max);
        }
        return a;
    }
}
