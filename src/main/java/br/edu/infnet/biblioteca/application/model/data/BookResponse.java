package br.edu.infnet.biblioteca.application.model.data;

import br.edu.infnet.biblioteca.domain.model.data.book.BookCategory;
import br.edu.infnet.biblioteca.domain.model.data.book.BookPublisher;
import br.edu.infnet.biblioteca.state.BookState;

import java.time.LocalDate;

public class BookResponse {

    private String author;
    private String bookName;
    private String bookDescription;
    private LocalDate publicationDate;
    private BookPublisher bookPublisher;
    private BookCategory bookCategory;
    private BookState state;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public BookPublisher getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(BookPublisher bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public BookState getState() {
        return state;
    }

    public void setState(BookState state) {
        this.state = state;
    }
}
