package JAVA_27866;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        int B = sc.nextInt()-1;

        System.out.println(A.charAt(B));

        sc.close();
    }
}