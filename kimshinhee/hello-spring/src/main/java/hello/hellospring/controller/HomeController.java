package hello.hellospring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/") // 슬래쉬는 맨 처음에 localhost 들어올때 아래가 호출된다.
    public String home() {
        return "home";
    }
}