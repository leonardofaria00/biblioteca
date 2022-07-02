package br.edu.infnet.biblioteca.domain.service.book;

import br.edu.infnet.biblioteca.domain.model.data.BookRequest;
import br.edu.infnet.biblioteca.domain.model.data.BookStatus;
import br.edu.infnet.biblioteca.domain.model.data.book.Book;
import br.edu.infnet.biblioteca.domain.repository.book.BookRepository;
import br.edu.infnet.biblioteca.infrastructure.model.mapper.BookMapper;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    private final BookMapper bookMapper;

    public BookServiceImpl(final BookRepository bookRepository, final BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    public Book createBook(final BookRequest bookRequest) {
        final Book book = bookMapper.convertRequestToBook(bookRequest, BookStatus.DISPONIVEL);
        return bookRepository.createBook(book);
    }

    @Override
    public Book findBookByUuid(final String bookUuid) {
        return bookRepository.findBookByUuid(bookUuid);
    }
}
