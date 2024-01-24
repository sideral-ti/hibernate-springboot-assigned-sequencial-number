package cl.sideralti.hibernate.controller;

import cl.sideralti.hibernate.service.AuthorServiceInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sideral")
public class AuthorRestController {

    private AuthorServiceInterface authorServiceInterface;

    public AuthorRestController(AuthorServiceInterface authorServiceInterface) {
        this.authorServiceInterface = authorServiceInterface;
    }


}
