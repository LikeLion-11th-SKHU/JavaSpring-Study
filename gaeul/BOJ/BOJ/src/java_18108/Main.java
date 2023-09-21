//참고: https://blog.naver.com/govkflek/222832860569
package java_18108;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        final int DIF = 2541 - 1998;
//질문: final 붙이는 이유
        System.out.println(year - DIF);

        scanner.close();
    }
}