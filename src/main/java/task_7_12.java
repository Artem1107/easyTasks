/**
 * Найти сумму целых положительных чисел больше 30 и меньше 100, кратных 3 и оканчивающихся на 2,4 или 8
 */
public class task_7_12 {

    public static void main(String[] args) {
         int sum = 0;

        for (int i = 30; i < 100; i++) {
            int rez=i%3;
            int rez2=(i % 10);
            if (rez==0 & (rez2==2 || rez2==4 || rez2==8)) {
                sum =sum+ i;
        }
    }
        System.out.println("Сумма целых положительных чисел больше 30 и меньше 100, кратных 3 и оканчивающихся на 2,4 или 8: " + sum);
    }
}
