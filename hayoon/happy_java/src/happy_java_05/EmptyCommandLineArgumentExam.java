package happy_java_05;

public class EmptyCommandLineArgumentExam {
    public static void main(String[] args) {
        System.out.println(args.length);
    }
}

// String[] args = new String[0];
// main(args); -> 0개짜리 String 배열이 넘어와서 실행됨.

// java EmptyCommandLineArgumentExam.java
// java EmptyCommandLineArgumentExam a b c d hello
// (공백 기준으로 5개의 문자열 배열이 args에 들어옴)
// java -javaagent:어떤설정 EmptyCommandLineArgumentExam a b c