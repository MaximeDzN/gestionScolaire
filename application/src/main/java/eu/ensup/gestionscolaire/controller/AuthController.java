package eu.ensup.gestionscolaire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("login")
    public String viewLoginPage(){
        return "login";
    }

    @GetMapping
    public String redirectSlash(){
        return "login";
    }


}
