package other;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Сумма цифр числа.
 */
public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        int number = Math.abs(ThreadLocalRandom.current().nextInt());
        System.out.println("Число: " + number);

        int summ = 0;
        while (number > 0) {
            int digit = number % 10;
            summ += digit;
            number /= 10;
        }

        System.out.println("Сумма цифр числа: " +  summ);
    }
}
