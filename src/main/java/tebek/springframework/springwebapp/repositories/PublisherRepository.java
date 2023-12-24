package tebek.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import tebek.springframework.springwebapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
