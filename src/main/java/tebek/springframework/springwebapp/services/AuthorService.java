package tebek.springframework.springwebapp.services;

import tebek.springframework.springwebapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
