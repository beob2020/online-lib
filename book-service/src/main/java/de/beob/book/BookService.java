package de.beob.book;

import de.beob.book.dtos.BookDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.awt.print.Book;
import java.util.List;

@ApplicationScoped
public class BookService {
    @Inject
    BookRepository bookRepository;

    @Transactional
    public BookEO addBook(BookEO bookEO) {
        bookRepository.persist(bookEO);
        return bookEO;
    }

    public List<BookDto> findAllBooks() {
        List<BookEO> bookEOS = bookRepository.listAll();

        return BookDto.mapToDto(bookEOS);
    }

    public BookEO findBookById(Long id) {
        return bookRepository.findById(id);
    }
    public void updateBook(Long id, Book book) {
    }

    public void deleteBook(Long id) {
    }
}
