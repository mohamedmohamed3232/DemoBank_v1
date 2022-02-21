package com.demo_bank_v1.DemoBank_v1.controllers;

import com.demo_bank_v1.DemoBank_v1.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class RegisterController {
    @GetMapping("/register")
    public ModelAndView getRegister() {
        ModelAndView getRegisterPage = new ModelAndView("register");
        System.out.println("In Register page");
        getRegisterPage.addObject("PageTitle","Register");
        return getRegisterPage;
    }

    @PostMapping("/register")
    public ModelAndView register(@Valid @ModelAttribute("registerUser")User user, BindingResult result,
                                 @RequestParam("first_name") String first_name,
                                 @RequestParam("last_name") String last_name,
                                 @RequestParam("email") String email,
                                 @RequestParam("password") String password,
                                 @RequestParam("confirm_password") String confirm_paassword) {
        ModelAndView registrationPage = new ModelAndView("register");
        // Check for Errors:
        if(result.hasErrors() && confirm_paassword.isEmpty()) {
            registrationPage.addObject("confirm_pass", "The confirm Field is required");
            return registrationPage;
        }
        return registrationPage;
    }

}
