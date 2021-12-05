package cc.javastudio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/say/hello")
public class HelloController {

    @GetMapping
    public String printHello(@RequestParam(defaultValue = "Hi") String greet,
                             @RequestParam(defaultValue = "There") List<String> name,
                             Model model) {

        String sep = " & ";
        String names = "";
        for(String el : name){
            names += name;
        }
        names = names.substring(names.length()-sep.length());
        model.addAttribute("title", greet + " " + names);
        model.addAttribute("date", new java.util.Date());
        return "hello";
    }



}
