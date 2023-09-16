/**
 * Найти все трехзначные числа, чьи квадраты оканчиваются тремя цифрами которые и составляют искомые числа
 */

public class task_7_11a {
    public static void main(String[] args) {
        System.out.println("Числа, чьи квадраты оканчиваются тремя цифрами которые и составляют искомые числа:");
        for (int i = 100; i < 1000; i++) {
            squareOfThreeDigitNumbers(i);
        }
    }

    public static void squareOfThreeDigitNumbers(int threeDigits) {
        int a = threeDigits / 100;
        int b = threeDigits / 10 % 10;
        int c = threeDigits % 10;
       int squareThreeDigits = (int) Math.pow(threeDigits,2);
       int num=squareThreeDigits%1000;
        if (threeDigits == num) {
            System.out.print(" " + threeDigits);
        }
    }

}
