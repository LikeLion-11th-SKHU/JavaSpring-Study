package java_25314;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n = N / 4;
        System.out.println("long ".repeat(n) + "int");
        /*
        List<String> List = new ArrayList<String>();
        for (int i = 0; i < N; i++){
            List.add("long ");
        }
        List.add("int");
        for(int i = 0; i<(N + 1); i++) {
            System.out.println(List.get(i));
        }*/
    }
}
