package eu.ensup.gestionscolaire.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("login")
    public String viewLoginPage(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(auth instanceof AnonymousAuthenticationToken) {
            return "login";
        } else {
            return "redirect:/home";
        }
    }

    @GetMapping
    public String redirectSlash(){
        return "redirect:/home";
    }


}
