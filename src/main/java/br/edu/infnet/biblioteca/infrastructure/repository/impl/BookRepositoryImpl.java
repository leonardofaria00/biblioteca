package br.edu.infnet.biblioteca.infrastructure.repository.impl;

import br.edu.infnet.biblioteca.domain.model.data.book.Book;
import br.edu.infnet.biblioteca.domain.model.mapper.BookMapper;
import br.edu.infnet.biblioteca.domain.repository.book.BookRepository;
import br.edu.infnet.biblioteca.infrastructure.model.data.book.BookDocument;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

@Component
public class BookRepositoryImpl implements BookRepository {

    private static final ArrayList<BookDocument> BOOK_DOCUMENT_ARRAY_LIST = new ArrayList<>();

    private final BookMapper bookMapper;

    public BookRepositoryImpl(final BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public Book createBook(final Book book) {
        final BookDocument document = bookMapper.convertBookToBookDocument(book, getUuid(), getLocalDate());

        // TODO Salvar na base de dados
        BOOK_DOCUMENT_ARRAY_LIST.add(document);

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
        BookDocument document = BOOK_DOCUMENT_ARRAY_LIST.get(0);

        return bookMapper.convertBookDocumentToBook(document);
    }

    @Override
    public Book rentBook(final Book book) {
        BookDocument document = bookMapper.convertBookToBookDocument(book);
        document.setUpdateDate(LocalDate.now());

        BOOK_DOCUMENT_ARRAY_LIST.set(0, document);

        return bookMapper.convertBookDocumentToBook(document);
    }
}
