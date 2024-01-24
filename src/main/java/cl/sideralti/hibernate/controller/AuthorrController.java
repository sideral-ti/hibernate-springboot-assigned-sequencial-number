package cl.sideralti.hibernate.controller;

import cl.sideralti.hibernate.service.AuthorServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sideral")
public class AuthorrController {

    private AuthorServiceInterface authorServiceInterface;

    public AuthorrController(AuthorServiceInterface authorServiceInterface) {
        this.authorServiceInterface = authorServiceInterface;
    }


    public String home(Model model) {
        model.addAttribute("title", "Welcome to Author Hibernate");
        return "authors";
    }
}
