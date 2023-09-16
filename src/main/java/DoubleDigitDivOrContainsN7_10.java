import java.util.Scanner;

/**
 * Задание 7.10
 */

public class DoubleDigitDivOrContainsN7_10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Введите любое число: ");

        if (scanner.hasNextInt()){
            int n = scanner.nextInt();
            System.out.println("Вуаля: ");
            for (int i = 10; i < 100; i++) {
                checkDivOrContainsN(i,n);
            }
        }
            else {
            System.out.println("Ебать вы гуманитарий, сударь");
        }
        }


    public static void checkDivOrContainsN(int doubleDigits, int n) {

        int a = doubleDigits % 10;
        int b = doubleDigits / 10;

        if (doubleDigits%n==0 || a==n || b==n) {
            System.out.print(" " + doubleDigits);
        }
    }


}
