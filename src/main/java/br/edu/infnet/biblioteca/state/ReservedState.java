package br.edu.infnet.biblioteca.state;

import br.edu.infnet.biblioteca.domain.model.data.book.Book;

public class ReservedState implements BookState {

    @Override
    public void next(final Book book) {
        book.setBookState(new RentedState());
    }

    @Override
    public void prev(final Book book) {
        book.setBookState(new AvailableState());
    }

    @Override
    public void printStatus() {
        System.out.println("State Reserved");
    }
}
