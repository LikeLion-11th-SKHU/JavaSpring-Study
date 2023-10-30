package java_2884;
import java.util.Scanner;

public class TimeCalculator {
    private int time; // private 변수
    private int min;

    public TimeCalculator(int time, int min) { //생성자를 만들어 입력된 시간과 분을 초기화
        this.time = time;
        this.min = min;
    }

    public int getTime() { // time 변수의 값 반환
        return time;
    }

    public void setTime(int time) { // time 변수의 값 설정
        this.time = time;
    }

    public int getMin() { //min 변수의 값 반환
        return min;
    }

    public void setMin(int min) { // min 변수의 값 설정
        this.min = min;
    }


    public void calculateTime() {  // 인스턴스 메소드
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
