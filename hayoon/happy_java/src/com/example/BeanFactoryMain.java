package com.example;

public class BeanFactoryMain {
    public static void main(String[] args) {
//        BeanFactory bf1 = new BeanFactory();
//        BeanFactory bf2 = new BeanFactory();
//        BeanFactory bf3 = new BeanFactory();
//        BeanFactory bf4 = new BeanFactory();
//        BeanFactory bf5 = new BeanFactory();
//
//        BeanFactory.instance = null;

        BeanFactory bf1 = BeanFactory.getInstance();
        BeanFactory bf2 = BeanFactory.getInstance();
        if(bf1 == bf2){
            System.out.println("bf1 == bf2");
        }

        Bus b1 = bf1.getBus();
        Bus b2 = bf1.getBus();

        // Bus b3 = new Bus(); 대신 생성과정을 다른 객체(팩토리)한테 맡긴 후 리턴받아 사용
    }
}