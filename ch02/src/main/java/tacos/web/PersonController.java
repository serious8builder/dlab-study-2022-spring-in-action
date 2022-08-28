package tacos.web;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tacos.Person;

import javax.validation.Valid;

@Controller
@RequestMapping("/person")
public class PersonController {
    @GetMapping("/result")
    public String showResult() {
        return "person/result";
    }

    @GetMapping("")
    public String showForm(Person person) {
        return "person/form";
    }

    @PostMapping("")
    public String checkPersonInfo(@Valid Person person, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getAllErrors());
            return "person/form";
        }
        return "redirect:/person/result";
    }
}
