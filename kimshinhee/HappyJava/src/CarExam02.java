public class CarExam02 {
    public static void main(String[] args){
        Car c1 = new Car();
        System.out.println(c1); //println(Object x) - Object로 참조할 수 있는 것은 무엇이든 ㅇ
        c1.printName();

        Car c2 = new Car("urstroy");
        c2.printName();
    }
}
