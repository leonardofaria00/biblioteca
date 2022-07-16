package br.edu.infnet.biblioteca.application.controller.book;

import br.edu.infnet.biblioteca.application.model.data.BookResponse;
import br.edu.infnet.biblioteca.domain.model.data.book.BookCategory;
import br.edu.infnet.biblioteca.domain.model.data.book.BookPublisher;
import br.edu.infnet.biblioteca.domain.model.data.book.BookRentRequest;
import br.edu.infnet.biblioteca.domain.model.data.book.BookRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class RentBookControllerTest {

    @Autowired
    private BookController controller;

    @Test
    void rentBookWithSuccess() {
        BookRequest request = new BookRequest();
        request.setBookName("Clean Code");
        request.setBookDescription("Hands-on Agile Software Skills");
        request.setAuthor("Eric Evans");
        request.setPublicationDate(LocalDate.of(2011, 10, 8));
        request.setBookCategory(BookCategory.TECHNOLOGY);
        request.setBookPublisher(BookPublisher.SARAIVA);

        controller.createBook(request);

        BookRentRequest rentRequest = new BookRentRequest();
        rentRequest.setUuid("123");
        BookResponse book = controller.rentBook(rentRequest);
        book.getState().printStatus();
    }
}
