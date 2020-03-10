package com.ae.exercise204;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import javax.jws.WebParam;
import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/carform")
    public String loadCarForm(Model model){
        model.addAttribute("car", new Car());
        return "carform";
    }
    public String processCarForm(@Valid Car car, BindingResult result){
        if (result.hasErrors()){
            return "carform";
        }
        return "carconfirm";
    }
}
