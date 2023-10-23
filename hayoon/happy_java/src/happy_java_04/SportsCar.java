package happy_java_04;

public class SportsCar extends Car2{
    // 부모가 기본생성자가 없기 때문에 반드시 super()를 호출한다.
    public SportsCar(String name) {
        super(name);
    }

    @Override
    public void run() { // Car2 기본생성자 없기 때문에 생성자 만들어주고 부모생성자에 값 전달해야 함.
        System.out.println("사륜구동으로 동작한다.");
    }
}