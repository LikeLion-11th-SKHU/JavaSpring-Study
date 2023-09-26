package java_10810;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int[] array = new int[n];

        int a, b, k;

        for(int i=0; i<m; i++) {
            a = input.nextInt();
            b = input.nextInt();
            k = input.nextInt();

            for(int j=a; j<=b; j++) {
                array[j-1] = k;
            }
        }

        for(int i=0; i<n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
