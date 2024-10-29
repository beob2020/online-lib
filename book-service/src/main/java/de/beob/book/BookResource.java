package de.beob.book;


import de.beob.book.dtos.BookDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;

import java.awt.print.Book;
import java.util.List;

@Path("/api/books")
@Slf4j
public class BookResource {

    @Inject
    BookService bookService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<BookDto> getAllBooks() {
        log.info("Get all books");
        return bookService.findAllBooks();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateBook(@PathParam("id") Long id, Book book) {
        log.info("Update book with id: {}", id);
        bookService.updateBook(id, book);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteBook(@PathParam("id") Long id) {
        log.info("Delete book with id: {}", id);
        bookService.deleteBook(id);
        return Response.noContent().build();
    }

}
