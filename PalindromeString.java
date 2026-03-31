import java.util.Scanner;

public class PalindromeString {
    public static  void main(String[] arge){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(reversed)?"yes":"no");
        scanner.close();
    }
}
