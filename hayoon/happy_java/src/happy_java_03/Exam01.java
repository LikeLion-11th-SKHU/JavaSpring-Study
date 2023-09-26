package happy_java_03;

public class Exam01 {
    public static void main(String[] args){
        Parent p1 = new Parent();
        System.out.println(p1.i); // 필드 직접 접근하는 코드는 객체지향에서 좋지 않다.
        p1.printI();
        System.out.println("--------------------");
        Child c1 = new Child();
        System.out.println(c1.i);
        c1.printI();
        System.out.println("--------------------");
        Parent p2 = new Child(); //Child는 Parent의 후손이다. 혹은 자식이다.
        System.out.println(p2.i); // 필드는 부모타입을 따라가서 5가 출력.
        p2.printII();
        p2.printI(); // 메소드는 오버라이딩되면 자식께 실행된다.
    }
}
