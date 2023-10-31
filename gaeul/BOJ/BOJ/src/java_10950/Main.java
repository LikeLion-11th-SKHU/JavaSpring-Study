package java_10950;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);

        // 테스트 케이스 개수
        int t = in.nextInt();

        for (int i =0; i < t ; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println(a+b);
        }

        in.close();
    }
}