/**
 * найти все трёхзначные числа, кратные 7 и у которых сумма цифр так же кратна 7
 */
public class task_7_11b {
    public static void main(String[] args) {
        System.out.println("числа, кратные 7 и у которых сумма цифр так же кратна 7:");
        for (int i = 100; i < 1000; i++) {
            numberMultiplesOfSeven(i);
        }
    }

    public static void numberMultiplesOfSeven(int threeDigits) {
        int a = threeDigits / 100;
        int b = threeDigits / 10 % 10;
        int c = threeDigits % 10;
        int rez=threeDigits%7;
        int rez2=(a+b+c)%7;
        if (rez==0 & rez2==0) {
            System.out.print(" " + threeDigits);
        }
    }

}
