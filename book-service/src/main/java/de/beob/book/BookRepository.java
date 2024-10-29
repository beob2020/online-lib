package de.beob.book;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.awt.print.Book;
import java.util.List;

@ApplicationScoped
public class BookRepository implements PanacheRepository<BookEO> {


    // Custom methods can be added here if needed
    public List<BookEO> findByAuthor(String author) {
        return list("author", author);
    }
}
