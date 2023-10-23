package com.example.fw;
/*
Controller의 종류가 여러개더라.
초기화 - 항상 같은 코드
실행 - 다른 코드
마무리 - 항상 같은 코드
*/
public abstract class Controller { // abstract -> 반드시 상속
    // protected는 같은 package이거나 상속받았을 경우 접근 가능하다.
    // final이 붙은 메소드는 오버라이딩이 금지가 됨.
    protected final void init(){
        System.out.println("초기화 하는 코드");
    }
    protected final void close(){
        System.out.println("마무리 하는 코드");
    }
    protected abstract void run(); // 매번 달라지는 코드 <- 강제로 오버라이딩하게 함.

    // 내가 가지고 있는 메소드를 호출한다.
    // 어떤 순서를 가지고 있다. 이런 메소드를 템플릿 메소드라고 한다.
    public void execute(){
        this.init(); // this. = 생략가능
        this.run();
        this.close();
    }
}