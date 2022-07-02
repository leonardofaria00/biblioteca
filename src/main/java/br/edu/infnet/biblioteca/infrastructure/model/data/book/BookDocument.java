package br.edu.infnet.biblioteca.infrastructure.model.data.book;

import br.edu.infnet.biblioteca.domain.model.data.BookStatus;
import br.edu.infnet.biblioteca.domain.model.data.book.BookCategory;
import br.edu.infnet.biblioteca.domain.model.data.book.BookPublisher;

import java.time.LocalDate;

public class BookDocument {

    private String uuid;
    private String author;
    private String bookName;
    private String bookDescription;
    private LocalDate publicationDate;
    private BookPublisher bookPublisher;
    private BookCategory bookCategory;
    private BookStatus bookStatus;
    private LocalDate createDate;
    private LocalDate updateDate;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

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

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
}
