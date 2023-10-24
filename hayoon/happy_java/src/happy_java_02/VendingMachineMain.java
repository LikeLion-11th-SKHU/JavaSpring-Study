package happy_java_02;

public class VendingMachineMain {
    public static void main(String[] args){
        VendingMachine.printVersion();
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductButton(100);
//        vm1.printVersion(); //static한 메소드는 레퍼런스변수형.static메소드() - 사용지양
        System.out.println(product);
        String product2 = vm2.pushProductButton(200);
        System.out.println(product2);
    }
}
