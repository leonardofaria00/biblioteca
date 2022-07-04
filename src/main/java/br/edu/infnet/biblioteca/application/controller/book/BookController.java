package br.edu.infnet.biblioteca.application.controller.book;

import br.edu.infnet.biblioteca.application.model.data.BookResponse;
import br.edu.infnet.biblioteca.domain.model.data.BookRequest;
import br.edu.infnet.biblioteca.domain.model.data.book.Book;
import br.edu.infnet.biblioteca.domain.model.mapper.BookMapper;
import br.edu.infnet.biblioteca.domain.service.book.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/biblioteca/v1/livros")
public class BookController {

    private final BookService bookService;

    private final BookMapper bookMapper;

    public BookController(final BookService bookService, final BookMapper bookMapper) {
        this.bookService = bookService;
        this.bookMapper = bookMapper;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public BookResponse createBook(@RequestBody final BookRequest bookRequest) {
        final Book book = bookService.createBook(bookRequest);
        return bookMapper.convertBookToBookResponse(book);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE)
    public BookResponse findBookByUuid(@PathVariable final String bookUuid) {
        final Book book = bookService.findBookByUuid(bookUuid);
        return bookMapper.convertBookToBookResponse(book);
    }
}
