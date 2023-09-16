/**
 * Найти все двузначные числа, сумма квадратов цифр которых делится на 13
 */

public class DoubleDigitsMod7_9a {
    public static void main(String[] args) {
        System.out.println("Двузначные числа квадрат суммы цифр которых делиться на 13: ");
        for (int i = 10; i < 100; i++) {
            modDoubleDigits(i);
        }
    }


    public static void modDoubleDigits(int doubleDigits) {
        int a = doubleDigits % 10;
        int b = doubleDigits / 10;
        int sumSquare = a * a + b * b;
        if (sumSquare % 13 == 0) {
            System.out.print(" " + doubleDigits);
        }
    }

}
