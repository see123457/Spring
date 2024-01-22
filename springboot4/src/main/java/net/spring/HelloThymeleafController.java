package net.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloThymeleafController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "World");
        return "helloworld";
    }
}