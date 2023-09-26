package happy_java_03;

public class PersonTest {
    public static void main(String[] args){
        Person p1 = new Person(); //p1은 null이다.
        Person p2 = new Person();
        p1.name = "홍길동"; //문자열은 new를 사용하지 않고 인스턴스를 사용할 수 있다. 되도록 new를 사용하지 말자(String사용할 땐)
        p2.name = "조조";
        p1.isVip = true;
        p1.address = "일산";
        p2.address = "서울";

        System.out.println(p1.name);
        System.out.println(p1.name.length());
        System.out.println(p1.address);
        System.out.println(p1.address.length());
        System.out.println(p1.isVip);
        System.out.println("------------------------------");
        System.out.println(p2.name);
        System.out.println(p2.name.length());
        System.out.println(p2.address);
        System.out.println(p2.isVip);
    }
}
