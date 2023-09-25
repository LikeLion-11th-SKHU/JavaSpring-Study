public class VendingMachine {
    public static void main(String[] args) {
        VendingMachine.printVersion();
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductButton(menuId: 100);
        // vm1.printVersion();  //static한 메소드는 레퍼런스변수명.static메소드()
        System.out.println(product);
         String product = vm2.pushProductButton(menuId: 100);
        System.out.println(product2);
    }
}
