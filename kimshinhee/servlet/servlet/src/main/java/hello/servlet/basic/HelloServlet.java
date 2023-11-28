package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    //이거 ctrl + 0하면 생성 가능
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.service(req, resp); 이코드는 삭제 하심

        System.out.println("HelloServlet.service"); // soutm 단축키->클래스명.메서드명

        System.out.println("request = " + request); // soutv 단축키
        System.out.println("response = " + response); // 출력 내용: tomcat이나..암튼 was서버가 많은데 구현체들이 찍힌 거임.

        String username = request.getParameter("username"); // 쿼리 파라미터를 굉장히 쉽게 읽도록 해줌.
        System.out.println("username = " + username);

        response.setContentType("text/plain"); //이 두개는 content타입에 들어감
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("hello " + username);//http message body에 내용 들어간다.

    }
}
