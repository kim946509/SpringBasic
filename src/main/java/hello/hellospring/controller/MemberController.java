package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    //private final MemberService memberService = new MemberService();
    //다른 controller에서도 memberService를 사용할 수 있는데 계속 new하는것은 비효율적. 하나만 있어도 상관없는 객체. Container에 등록하면됨.
    // Constructor 생성자로 하면됨
    private final MemberService memberService;

    @Autowired //스프링컨테이너에있는 멤버서비스를 가져다가 연결시켜줌
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
