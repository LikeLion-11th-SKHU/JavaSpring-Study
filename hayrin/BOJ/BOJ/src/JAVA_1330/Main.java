package JAVA_1330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        String splitArr[] = num.split(" ");
        int n1, n2;
        n1 = Integer.parseInt(splitArr[0]);
        n2 = Integer.parseInt(splitArr[1]);
        if (n1 == n2) {
            System.out.println("==");
        }
        else if (n1 > n2) {
            System.out.println(">");
        }
        else {
            System.out.println("<");
        }

    }
}