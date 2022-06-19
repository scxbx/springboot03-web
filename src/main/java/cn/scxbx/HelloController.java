package cn.scxbx;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;


@Controller
public class HelloController {
    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("msg", "<h1>hello</h1>");
        model.addAttribute("users", Arrays.asList("xie", "bang", "xian"));
        return "test";
    }

}
