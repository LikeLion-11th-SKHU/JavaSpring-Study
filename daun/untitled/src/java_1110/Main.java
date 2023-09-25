package java_1110;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int num = n;
        int cn = 0;

        while (true) {
            int a = num / 10;
            int b = num % 10;
            int c = (a + b) % 10;
            num = (b * 10) + c;
            cn++;
            if (num == n) {
                break;
            }
        }
        System.out.println(cn);
    }
}
