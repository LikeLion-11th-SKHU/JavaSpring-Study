import java.util.Scanner;

//1번
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

//2번
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();

        System.out.println(A+B);
    }
}

//3번
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();

        System.out.println(A-B);
    }
}

//4번
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();

        System.out.println(A*B);
    }
}

//5번 참고: https://blog.naver.com/mnnyng/223168953452
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        double div = (double) a / b;
        System.out.println(div);
    }
}