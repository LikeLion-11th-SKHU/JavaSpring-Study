package happy_java_03;

public class Parent {
    public int i = 5;
    public void printII(){
        System.out.println(i * 2); // I는 10이라 예상
    }
    public void printI(){
        System.out.println("parent - printI() : " + i);
    }
}
