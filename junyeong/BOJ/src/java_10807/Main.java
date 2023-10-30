package java_10807;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int [] n = new int[a];
        for(int i=0;i<a;i++){
            n[i]=input.nextInt();
        }
        int v = input.nextInt();
        int count = 0;
        for (int i=0;i<n.length;i++){
            if (n[i]==v){
                count++;
            }

        }
        System.out.println(count);
        input.close();

    }
}
