package happy_java_04;

public abstract class Car2 {
    public Car2(String name){
        super(); // 자동으로 들어간다.
        System.out.println("Car2() 생성자 호출");
    }

    // 추상메소드. (선언만 되어있는 메소드) Car2를 만든 사람은 run()이라는 메소드가 필요하다고 생각을 하였다.
    // run()은 자동차마다 다르게 구현할 것 같아.
    public abstract void run(); // 구현 부분없이 선언만 해줌.
}