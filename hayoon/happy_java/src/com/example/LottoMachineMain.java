package com.example;

public class LottoMachineMain {
    public static void main(String[] args) {

//        Ball b1 = new Ball(1);
//        Ball b2 = new Ball(2);
//        ......
//        Ball b45 = new Ball(45);
        // 변수가 45개 필요하다. Ball 인스턴스를 45개 참조할 수 있는 배열이 만들어진다.
        // 배열은 45개의 참조할 수 있는 변수를 선언한 것이지 뒤에 new 인스턴스를 생성한 것이 아님.
        Ball[] balls = new Ball[LottoMachine.MAX_BALL_COUNT]; // 배열 = 방
//        balls[0] = new Ball(1);
//        balls[1] = new Ball(2);
//        ...
//        balls[44] = new Ball(45);
        for(int i = 0; i < LottoMachine.MAX_BALL_COUNT; i++){
            balls[i] = new Ball(i + 1);
        }

        // LottoMachine 인스턴스가 생성된다.
        LottoMachine lottoMachine = new LottoMachineImpl();
        lottoMachine.setBalls(balls);
        lottoMachine.mix();
        Ball[] result = lottoMachine.getBalls();

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i].getNumber());
        }
    }
}