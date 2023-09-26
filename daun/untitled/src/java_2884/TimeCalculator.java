package java_2884;
import java.util.Scanner;

public class TimeCalculator {
    private int time;
    private int min;

    public TimeCalculator(int time, int min) {
        this.time = time;
        this.min = min;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }


    public void calculateTime() {
        if (min < 45 && time != 0) {
            time = time - 1;
            min = min - 45 + 60;
        } else if (min >= 45 && time == 0) {
            min = min - 45;
        } else if (time == 0 && min < 45) {
            time = 23;
            min = min - 45 + 60;
        } else if (time != 0 && min >= 45) {
            min = min - 45;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();
        int min = scanner.nextInt();

        TimeCalculator calculator = new TimeCalculator(time, min);
        calculator.calculateTime();

        System.out.println(calculator.getTime() + " " + calculator.getMin());
    }
}
