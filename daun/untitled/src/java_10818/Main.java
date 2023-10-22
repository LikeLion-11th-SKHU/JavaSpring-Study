package java_10818;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N - 1]);

        /*
        Scanner scanner1 = new Scanner(System.in);
        List<String> List = new ArrayList<String>();
        for(int i = 0; i < N; i++) {
            List.add(String.valueOf(scanner1.nextInt()));
        }
        int max = 0;
        int min = Integer.parseInt(List.get(0));
        for(int i = 0; i < N; i++){
            if(max < Integer.parseInt(List.get(i))){
                max = Integer.parseInt(List.get(i));
            }
            if(min > Integer.parseInt(List.get(i))){
                min = Integer.parseInt(List.get(i));
            }
        }
        System.out.println(min + " " + max);
        }
        */
    }
}
