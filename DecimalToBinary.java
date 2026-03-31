import java.util.Scanner;

public class DecimalToBinary {
    // 输出整数N的二进制形式
    public static void printBinary(int n) {
        if (n == 0) {
            System.out.print("0");
            return;
        }
        StringBuilder sb = new StringBuilder();
        int num = n;
        while (num > 0) {
            sb.append(num % 2);
            num /= 2;
        }
        // 反转得到正确顺序
        System.out.print(sb.reverse());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            printBinary(i);
            System.out.println();
        }
        scanner.close();
    }
}
