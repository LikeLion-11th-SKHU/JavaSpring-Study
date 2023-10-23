package com.example.myproject;

import com.example.fw.Controller;

public class FirstController extends Controller { // 추상클래스를 상속받으면 반드시 오버라이딩 해야 함.
    @Override
    protected void run() { // 상속을 받았기 때문에 다른 package여도 run()메소드 사용 가능.
        System.out.println("별도로 동작하는 코드 111111");
    }
}