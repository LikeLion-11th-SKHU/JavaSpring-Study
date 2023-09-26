package java_11382;
import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        BigInteger C = sc.nextBigInteger();
        sc.close();

        System.out.println(A.add(B).add(C));
    }
}

//int의 크기에 한계가 있음

