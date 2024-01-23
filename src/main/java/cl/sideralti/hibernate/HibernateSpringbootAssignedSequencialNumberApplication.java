package cl.sideralti.hibernate;

import cl.sideralti.hibernate.service.AuthorService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateSpringbootAssignedSequencialNumberApplication {

	private final AuthorService authorService;

	public HibernateSpringbootAssignedSequencialNumberApplication(AuthorService authorService) {
		this.authorService = authorService;
	}

	public static void main(String[] args) {
		SpringApplication.run(HibernateSpringbootAssignedSequencialNumberApplication.class, args);
	}

	@Bean
	public ApplicationRunner init() {
		return args -> {
			System.out.println("\n\nUsing ORDER BY only in OVER: ");
			authorService.fetchAuthorWithSeqNumber1();

			System.out.println("\n\nUsing ORDER BY only in query: ");
			authorService.fetchAuthorWithSeqNumber2();

			System.out.println("\n\nUsing ORDER BY OVER and in query: ");
			authorService.fetchAuthorWithSeqNumber3();

			System.out.println("\n\nUsing multiple columns in OVER");
			authorService.fetchAuthorWithSeqNumber4();
		};
	}

}
