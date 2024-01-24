package cl.sideralti.hibernate.service;

import cl.sideralti.hibernate.repository.BookRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface BookServiceInterface extends BookRepository {



}
