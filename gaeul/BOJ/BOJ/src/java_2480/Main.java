package java_2480;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        in.close();

        // 모두같은 경우
        if ( a == b && b == c && a == c){
            System.out.println(10000+(a*1000));
        } else if ( a == b && b != c ){
            System.out.println(1000+(a*100));
        } else if ( a == c && a != b ){
            System.out.println(1000+(a*100));
        } else if (b == c && a != b){
            System.out.println(1000+(b*100));
        } else if ( a != b && b !=c && a != c){
            if ( a > b && b > c){
                System.out.println(a*100);
            } else if ( a > c && c > b){
                System.out.println(a*100);
            } else if (b > a && a > c){
                System.out.println(b*100);
            } else if (b > c && c > a){
                System.out.println(b*100);
            } else if ( c > a && a > b){
                System.out.println(c*100);
            } else if ( c > b && b > a ){
                System.out.println(c*100);
            }

        }

    }
}