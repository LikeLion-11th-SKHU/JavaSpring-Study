package java_2839;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int bag = 0;
        while(n != 0) {
            if(n < 3){
                bag = -1;
                break;
            }
            if(n % 5 ==0){
                n -= 5;
                bag++;
            }
            else{
                n -= 3;
                bag++;
            }
        }
        System.out.println(bag);
    }
}
