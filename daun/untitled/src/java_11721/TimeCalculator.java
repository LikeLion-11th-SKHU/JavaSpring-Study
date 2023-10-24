package java_11721;
import java.util.Scanner;

public class TimeCalculator {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        scanner.close();

        for(int i = 0; i < N.length(); i++){
            System.out.print(N.charAt(i));
            if(i % 10 == 9){
                System.out.println();
            }
        }
    }
}
