package tebek.springframework.springwebapp.services;

import tebek.springframework.springwebapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
