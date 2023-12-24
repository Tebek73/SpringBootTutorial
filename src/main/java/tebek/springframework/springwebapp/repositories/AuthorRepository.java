package tebek.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import tebek.springframework.springwebapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
