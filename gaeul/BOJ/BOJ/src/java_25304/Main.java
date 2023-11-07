package java_25304;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int total = in.nextInt();
        int n = in.nextInt();
        int sum = 0;

        for ( int i=0; i < n; i ++){
            int money = in.nextInt();
            int any = in.nextInt();

            sum += money * any;
        }

        in.close();

        if( total == sum){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}