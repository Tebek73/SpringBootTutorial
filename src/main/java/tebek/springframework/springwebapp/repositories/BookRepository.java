package tebek.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import tebek.springframework.springwebapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
