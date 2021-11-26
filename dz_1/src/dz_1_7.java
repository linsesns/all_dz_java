import java.util.Scanner;

public class dz_1_7 {
    public dz_1_7() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        sc.close();
        System.out.println("Факториал числа " + a + " = " + getFactorial(a));
    }

    public static int getFactorial(int number) {
        int result = 1;

        for(int i = 1; i <= number; ++i) {
            result *= i;
        }

        return result;
    }
}
