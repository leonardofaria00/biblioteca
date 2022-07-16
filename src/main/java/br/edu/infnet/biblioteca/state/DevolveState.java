package br.edu.infnet.biblioteca.state;

import br.edu.infnet.biblioteca.domain.model.data.book.Book;

public class DevolveState implements BookState {
    @Override
    public void next(final Book book) {
        book.setState(new AvailableState());
    }

    @Override
    public void prev(final Book book) {
        book.setState(new RentedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Esse é o status de devolvido");
    }
}
