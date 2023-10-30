package java_27866;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int i = scanner.nextInt();
        String[] list;
        list = S.split("");
        System.out.println(list[i - 1]);
    }
}
