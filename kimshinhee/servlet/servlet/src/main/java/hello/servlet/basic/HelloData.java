package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

//lombok 사용하면 getter setter자동 호출
@Getter @Setter
public class HelloData {
    private String username;
    private int age;
    //오른쪽 키- generate - 생성 - getter and setter
}
