package happy_java_03;

public class CarExam01 {
    public static void main(String[] args){
        Bus b1 = new Bus();
        b1.run();
//        b1.안내방송();

        Car c1 = new Bus(); // 버스는 자동차다.
        c1.run(); // 그(c1)자동차는 달린다.
//        c1.안내방송(); // Car에 있는 메소드만 사용 가능
        Bus b2 = (Bus)c1;
        b2.안내방송();

        Car c2 = new SuperCar();
        c2.run();
    }
}
