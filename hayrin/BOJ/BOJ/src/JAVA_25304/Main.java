package JAVA_25304;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int X = in.nextInt();
        int N = in.nextInt();

        for(int i = 0; i <N; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            X = X - (a * b);
        }

        if(X == 0) System.out.println("Yes");
        else System.out.println("No");

    }
}
