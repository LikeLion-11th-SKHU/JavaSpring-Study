package com.example;

public class MyRunnableMain {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("myrunnable run!!!");
            }
        }; // 자동으로 이름없는 객체 만들어줌

        r.run();
    }
}