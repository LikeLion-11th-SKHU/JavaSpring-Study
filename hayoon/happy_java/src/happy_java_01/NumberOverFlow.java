package happy_java_01;

public class NumberOverFlow {
    public static void main(String[] args) {
        int value = 10;
        int maxInt = Integer.MAX_VALUE;

        System.out.println(value + 1);
        System.out.println(maxInt + 1);

        double d1 = 50;
        double d2 = 500L;

        System.out.println(d1);
        System.out.println(d2);
    }
}
