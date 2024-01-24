package cl.sideralti.hibernate.controller;


import cl.sideralti.hibernate.service.BookServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sideral")
public class BookController {

    private BookServiceInterface bookServiceInterface;

    public BookController(BookServiceInterface bookServiceInterface) {
        this.bookServiceInterface = bookServiceInterface;
    }

    @GetMapping("/")
    public String inde(Model model) {
        model.addAttribute("title", "Welcome to Hibernate");
        return "index";
    }



}
