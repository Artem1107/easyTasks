/**
 * Задание 7.9 б
 */

public class DoubleDigitsSum7_9b {
    public static void main(String[] args) {
        System.out.println("Цифры с особенностью");
        for (int i = 10; i < 100; i++) {
            sumDoubleDigits(i);
        }
    }


    public static void sumDoubleDigits(int doubleDigits) {
        int a = doubleDigits % 10;
        int b = doubleDigits / 10;
        int sumAB = a + b;
        int sumSquare = sumAB * sumAB;
        if (sumAB + sumSquare == doubleDigits) {
            System.out.print(" " + doubleDigits);
        }
    }

}
