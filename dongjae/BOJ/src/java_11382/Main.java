package java_11382;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        a += scanner.nextInt();
        a += scanner.nextInt();

        System.out.println(a);
    }
}
