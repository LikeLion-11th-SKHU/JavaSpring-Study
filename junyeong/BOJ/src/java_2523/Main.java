package java_2523;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i<=n;i++){
               for (int j = 0; j<i;j++){
                   System.out.print("*");
               }
            System.out.println();
        }
        for (int i = n-1; i>0;i--){
            for (int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
