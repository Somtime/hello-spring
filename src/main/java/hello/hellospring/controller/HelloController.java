package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!");

        // return - 템플릿 엔진에서의 파일명으로 해주ㅕㅁㄴ됨
        return "hello";
    }
}
