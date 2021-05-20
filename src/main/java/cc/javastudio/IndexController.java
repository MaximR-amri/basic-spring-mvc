package cc.javastudio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String printHello(Model model) {
        model.addAttribute("title", "Home Page");
        model.addAttribute("message", "Enjoy your day!");
        model.addAttribute("date", new java.util.Date());
        return "index";
    }

}
