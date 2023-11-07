package happy_java_05;
import java.util.ArrayList;

public class ListExam01 {
    public static void main(String[] args) {
        // 자료구조객체들은 제네릭을 사용하지 않으면
        // Object 타입을 저장합니다.
        ArrayList list = new ArrayList(); // 제네릭 사용하지 않고 ArrayList 사용
//        ArrayList<String> list = new ArrayList<>(); // 제네릭 사용하고 ArrayList 사용
        list.add("kim");
        list.add("lee");
        list.add("hong");

        String str1 = (String)list.get(0); // (String)타입으로 형변환 - 제네릭 X
        String str2 = (String)list.get(1);
        String str3 = (String)list.get(2);

//        String str1 = list.get(0); // 형변환 없이 사용 - 제네릭 O
//        String str2 = list.get(1);
//        String str3 = list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}