package hello.hellospring.controller;
//import ch.qos.logback.core.model.Model; //이거때문에 model.addAttribute 오류생겼음.
import org.springframework.ui.Model;
import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Controller
public class MemberController {
    private final MemberService memberService;
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    //members/new-->url은 똑같지만 get이냐 post냐에 따라 다르게 mapping할수있다.
    //보통 데이터 등록할때 post, 조회할 때 get
    @GetMapping(value = "/members/new") //alt + enter 임포트해주기
    public String createForm() {
        return "members/createMemberForm"; //리턴하면 templates에서 찾음.
    }
    @PostMapping(value = "/members/new") //alt shift enter
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());


        System.out.println("member = " + member.getName());  //확인용으로 입력해보기
        
        memberService.join(member); //회원가입할때 join
        return "redirect:/"; //회원가입 끝났으니 home화면으로 보내주기
    }
    @GetMapping(value = "/members")
     public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }
}