package br.edu.infnet.biblioteca.infrastructure.repository;

import br.edu.infnet.biblioteca.domain.model.data.BookStatus;
import br.edu.infnet.biblioteca.domain.model.data.book.Book;
import br.edu.infnet.biblioteca.domain.model.data.book.BookCategory;
import br.edu.infnet.biblioteca.domain.model.data.book.BookPublisher;
import br.edu.infnet.biblioteca.domain.repository.book.BookRepository;
import br.edu.infnet.biblioteca.infrastructure.model.data.book.BookDocument;
import br.edu.infnet.biblioteca.infrastructure.model.mapper.BookMapper;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.UUID;

@Component
public class BookRepositoryImpl implements BookRepository {

    private final BookMapper bookMapper;

    public BookRepositoryImpl( final BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public Book createBook(final Book book) {
        final BookDocument document = bookMapper.convertBookToBookDocument(book, getUuid(), getLocalDate());
        // TODO Salvar na base de dados
        return bookMapper.convertBookDocumentToBook(document);
    }

    private String getUuid() {
        return UUID.randomUUID().toString();
    }

    private LocalDate getLocalDate() {
        return LocalDate.now();
    }

    @Override
    public Book findBookByUuid(final String bookUuid) {
        // TODO Buscar na base de dados pelo Uuid
        Book book = new Book();
        book.setBookName("Clean Code");
        book.setBookDescription("Hands-on Agile Software Skills");
        book.setAuthor("Eric Evans");
        book.setPublicationDate(LocalDate.of(2011, 10, 8));
        book.setBookCategory(BookCategory.TECHNOLOGY);
        book.setBookPublisher(BookPublisher.SARAIVA);
        book.setBookStatus(BookStatus.ALUGADO);
        return book;
    }
}
