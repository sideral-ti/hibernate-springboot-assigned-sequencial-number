package cl.sideralti.hibernate.controller;


import cl.sideralti.hibernate.service.BookServiceInterface;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    private BookServiceInterface bookServiceInterface;

    public BookRestController(BookServiceInterface bookServiceInterface) {
        this.bookServiceInterface = bookServiceInterface;
    }




}
