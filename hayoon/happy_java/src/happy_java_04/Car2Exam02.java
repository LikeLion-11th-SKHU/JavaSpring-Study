package happy_java_04;

public class Car2Exam02 {
    public static void main(String[] args) {
//        Car2 c = new Car2("urstory");

        Bus2 b = new Bus2();
        b.run();

        SportsCar s1 = new SportsCar("sportsCar!!");
        s1.run();

        Car2 c = new SportsCar("sportsCar!!");
        c.run(); // 어떤 결과가 나올까요? -> Car2 c = [  ] []부분에 어떤 결과가 써있는지에 따라 run 메소드가 달라지게 된다.
        // 실행해야만 결과를 알 수 있음 = 동적 언어(ex. java)

        Car2[] array = new Car2[2]; // Car2를 2개 참조할 수 있는 배열을 선언.
        array[0] = new Bus2(); // 배열 1 : Bus 참조
        array[1] = new SportsCar("sportsCar!!"); // 배열 2 : SportsCar 참조
        for(Car2 c2 : array){
            c2.run();
        }
    }
}