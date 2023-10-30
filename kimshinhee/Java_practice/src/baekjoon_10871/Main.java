import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        //배열 이용하기
        int arr[] = new int[N];
        
        //숫자 입력받기
        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        //배열 arr 차례대로 X보다 작으면 출력하기
        for (int i = 0; i < N; i++){
            if (arr[i] < X){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}