package tebek.springframework.springwebapp.services;

import org.springframework.stereotype.Service;
import tebek.springframework.springwebapp.domain.Author;
import tebek.springframework.springwebapp.repositories.AuthorRepository;

@Service
public class AuthorServiceImplementation implements AuthorService{

    private final AuthorRepository authorRepository;

    public AuthorServiceImplementation(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }
    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
