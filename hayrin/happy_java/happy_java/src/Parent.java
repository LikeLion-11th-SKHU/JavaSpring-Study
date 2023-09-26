public class Parent {
    public int i = 5;
    public void printII() {
        System.out.println(i * 2);
        //p2.printII()메소드 실행 시 필드도 오버라이딩 되면 무조건 자식 것이 사용돼 30이 나와야 함. 하지만 10 출력됨
    }
    public void printI() {
        System.out.println("parent - printI() : " + i);
    }
}
