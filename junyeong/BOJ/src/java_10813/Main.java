import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int m= input.nextInt();
        int [] ball= new int[n];
        for(int i=0;i<n;i++){
            ball[i]=i+1;

        }
        for (int count=0;count<m;count++){
            int i = input.nextInt();
            int j = input.nextInt();
            int x=ball[i-1];
            ball[i-1]=ball[j-1];
            ball[j-1]=x;
        }
        for (int i=0;i<n;i++) {
            System.out.print(ball[i] + " ");
        }
    }
}