package cl.sideralti.hibernate.repository;

import cl.sideralti.hibernate.dto.AuthorDto;
import cl.sideralti.hibernate.entity.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface AuthorRepository extends JpaRepository<Author, Long> {

    @Query(value = "SELECT ROW_NUMBER() OVER(ORDER BY age) "
    + "rowNum, name, age FROM author",
    nativeQuery = true)
    List<AuthorDto> fetchWithSeqNumber1();

    @Query(value = "SELECT ROW_NUMBER() OVER() "
            + "rowNum, name, age FROM author ORDER BY age",
            nativeQuery = true)
    List<AuthorDto> fetchWithSeqNumber2();

    @Query(value = "SELECT ROW_NUMBER() OVER(ORDER BY age) "
            + "rowNum, name, age FROM author ORDER BY name",
            nativeQuery = true)
    List<AuthorDto> fetchWithSeqNumber3();

    @Query(value = "SELECT ROW_NUMBER() OVER(ORDER BY age, name DESC) "
            + "rowNum, name, age FROM author",
            nativeQuery = true)
    List<AuthorDto> fetchWithSeqNumber4();
}
