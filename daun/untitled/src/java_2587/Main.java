package java_2587;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        int[] arr = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++){
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }
        Arrays.sort(arr);
        System.out.println(sum / 5);
        System.out.println(arr[2]);
    }
}
