package java_10950;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int array[] = new int[c];

        for (int i = 0; i < c; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            array[i] = a + b;
        }
        sc.close();

        for (int k : array) {
            System.out.println(k);
        }
    }
}