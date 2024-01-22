package net.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class FormController {
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("formInput", new FormInput());
        return "testinput";
    }

    @PostMapping("/submitForm")
    public String submitForm(@ModelAttribute FormInput formInput, Model model) {
        model.addAttribute("name", formInput.getName());
        return "result";
    }
}