package cl.sideralti.hibernate.service;

import cl.sideralti.hibernate.dto.AuthorDto;
import cl.sideralti.hibernate.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void fetchAuthorWithSeqNumber1() {
        List<AuthorDto> authors = authorRepository.fetchWithSeqNumber1();

        authors.forEach(a -> System.out.println(a.getRowNum()
        + ", " + a.getName() + ", " + a.getAge()));
    }

    public void fetchAuthorWithSeqNumber2() {
        List<AuthorDto> authors = authorRepository.fetchWithSeqNumber2();

        authors.forEach(a -> System.out.println(a.getRowNum()
                + ", " + a.getName() + ", " + a.getAge()));
    }

    public void fetchAuthorWithSeqNumber3() {
        List<AuthorDto> authors = authorRepository.fetchWithSeqNumber3();

        authors.forEach(a -> System.out.println(a.getRowNum()
                + ", " + a.getName() + ", " + a.getAge()));
    }

    public void fetchAuthorWithSeqNumber4() {
        List<AuthorDto> authors = authorRepository.fetchWithSeqNumber4();

        authors.forEach(a -> System.out.println(a.getRowNum()
                + ", " + a.getName() + ", " + a.getAge()));
    }

}
