package com.example.main;

import com.example.fw.Controller;
import com.example.myproject.FirstController;

public class ControllerMain {
    public static void main(String[] args) {
        Controller c1 = new FirstController();
        c1.execute(); // protected인 init(), run(), close() 메소드는 보이지 않음.
    }
}