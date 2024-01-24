package cl.sideralti.hibernate.service.implement;

import cl.sideralti.hibernate.service.BookServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl {

    private BookServiceInterface bookServiceInterface;

    public BookServiceImpl(BookServiceInterface bookServiceInterface) {
        this.bookServiceInterface = bookServiceInterface;
    }



}
