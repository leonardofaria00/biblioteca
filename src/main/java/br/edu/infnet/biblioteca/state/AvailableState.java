package br.edu.infnet.biblioteca.state;

import br.edu.infnet.biblioteca.domain.model.data.book.Book;

public class AvailableState implements BookState {


    @Override
    public void next(final Book book) {
        book.setBookState(new ReservedState());
    }

    @Override
    public void prev(final Book book) {
        throw new RuntimeException("This is primary state");
    }

    @Override
    public void printStatus() {
        System.out.println("State Available");
    }
}
