package tebek.springframework.springwebapp.services;

import org.springframework.stereotype.Service;
import tebek.springframework.springwebapp.domain.Book;
import tebek.springframework.springwebapp.repositories.BookRepository;

@Service
public class BookServiceImplementation implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImplementation(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
