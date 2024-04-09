package book;

import org.springframework.data.jpa.repository.JpaRepository;

public class BookService extends JpaRepository<Book,Integer> {
}
