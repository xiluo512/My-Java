import java.util.Scanner;

public class WalnutDistribution {
    // 求最大公约数（GCD）
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 求两个数的最小公倍数（LCM）
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    // 求三个数的最小公倍数
    public static int lcmOfThree(int a, int b, int c) {
        return lcm(lcm(a, b), c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = lcmOfThree(a, b, c);
        System.out.println(result);
        scanner.close();
    }
}
