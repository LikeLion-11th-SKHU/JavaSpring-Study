package happy_java_03;

public class Hello2 {
    static int i;
    static {
        i = 500;
        System.out.println("static block"); // 원래는 static field를 초기화한다.
    }
    public static void main(String[] args){
        System.out.println("Hello");
    }
}

// javac Hello2.java 로 컴파일
// java Hello2 라고 실행 -> JVM은 CLASSPATH에서 Hello2클래스를 찾음.