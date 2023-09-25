package JAVA_2753;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        sc.close();

        System.out.println((y%4==0)?((y%400==0)?"1":(y%100==0)?"0":"1"):"0");
    }
}
