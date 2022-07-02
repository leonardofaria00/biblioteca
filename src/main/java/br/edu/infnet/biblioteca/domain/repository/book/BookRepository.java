package br.edu.infnet.biblioteca.domain.repository.book;

import br.edu.infnet.biblioteca.domain.model.data.book.Book;

public interface BookRepository {

    Book createBook(Book book);

    Book findBookByUuid(String bookUuid);
}
