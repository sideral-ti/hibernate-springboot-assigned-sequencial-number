package cl.sideralti.hibernate.service.implement;

import cl.sideralti.hibernate.dto.AuthorDto;
import cl.sideralti.hibernate.repository.AuthorRepository;
import cl.sideralti.hibernate.service.AuthorServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl {

    private final AuthorServiceInterface authorServiceInterface;

    public AuthorServiceImpl(AuthorServiceInterface authorServiceInterface) {
        this.authorServiceInterface = authorServiceInterface;
    }

    public void fetchAuthorWithSeqNumber1() {
        List<AuthorDto> authors = authorServiceInterface.fetchWithSeqNumber1();

        authors.forEach(a -> System.out.println(a.getRowNum()
        + ", " + a.getName() + ", " + a.getAge()));
    }

    public void fetchAuthorWithSeqNumber2() {
        List<AuthorDto> authors = authorServiceInterface.fetchWithSeqNumber2();

        authors.forEach(a -> System.out.println(a.getRowNum()
                + ", " + a.getName() + ", " + a.getAge()));
    }

    public void fetchAuthorWithSeqNumber3() {
        List<AuthorDto> authors = authorServiceInterface.fetchWithSeqNumber3();

        authors.forEach(a -> System.out.println(a.getRowNum()
                + ", " + a.getName() + ", " + a.getAge()));
    }

    public void fetchAuthorWithSeqNumber4() {
        List<AuthorDto> authors = authorServiceInterface.fetchWithSeqNumber4();

        authors.forEach(a -> System.out.println(a.getRowNum()
                + ", " + a.getName() + ", " + a.getAge()));
    }

}
