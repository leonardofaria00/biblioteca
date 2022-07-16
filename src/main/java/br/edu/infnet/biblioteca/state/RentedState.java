package br.edu.infnet.biblioteca.state;

import br.edu.infnet.biblioteca.domain.model.data.book.Book;

public class RentedState implements BookState {
    @Override
    public void next(final Book book) {
        // deveria ter regras para validar se existe atrasos e features relacionadas ao negócio.
        book.setState(new DevolveState());
        System.out.println("Livro foi devolvido!");
    }

    @Override
    public void prev(final Book book) {
        book.setState(new ReservedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Esse é o status de alugado");
    }
}
