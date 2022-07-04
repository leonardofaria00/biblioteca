package br.edu.infnet.biblioteca.state;

import br.edu.infnet.biblioteca.domain.model.data.book.Book;

public  interface BookState {
    void next(Book book);
    void prev(Book book);
    void printStatus();

}

