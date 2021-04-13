package org.launchcode.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpringController {
    @GetMapping("hello")
    @ResponseBody
    public String helloSpring() {
        return "Hello, Spring!";
    }
}
