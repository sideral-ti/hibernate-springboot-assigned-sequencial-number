package cl.sideralti.hibernate.repository;

import cl.sideralti.hibernate.dto.AuthorDto;
import cl.sideralti.hibernate.entity.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
