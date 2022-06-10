package cn.scxbx;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("msg", "hello");
        return "test";
    }

}
