package com.example.util; // 도메인명 거꾸로 + 프로젝트명

public class Calculator {
    public int plus(int x, int y){
        return x + y;
    }

    public int minus(int x, int y){
        return x - y;
    }

    public static void main(String[] args){
        Calculator cal = new Calculator();
        int value = cal.plus(10, 100);
        System.out.println(value);
    }
}
