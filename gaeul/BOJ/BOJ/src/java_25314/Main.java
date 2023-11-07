package java_25314;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = "";
        int n = in.nextInt();

        in.close();

        int cnt = n/4;
        for (int i =0; i < cnt; i++){
            str += "long ";
        }

        System.out.println(str + "int");

    }
}