package br.edu.infnet.biblioteca.application.controller.book;

import br.edu.infnet.biblioteca.application.model.data.BookResponse;
import br.edu.infnet.biblioteca.domain.model.data.book.BookCategory;
import br.edu.infnet.biblioteca.domain.model.data.book.BookPublisher;
import br.edu.infnet.biblioteca.domain.model.data.book.BookRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class GetBookControllerTest {

    @Autowired
    private BookController controller;

    @Test
    void findBookByUuidWithSuccess() {
        BookRequest request = new BookRequest();
        request.setBookName("Clean Code");
        request.setBookDescription("Hands-on Agile Software Skills");
        request.setAuthor("Eric Evans");
        request.setPublicationDate(LocalDate.of(2011, 10, 8));
        request.setBookCategory(BookCategory.TECHNOLOGY);
        request.setBookPublisher(BookPublisher.SARAIVA);

        controller.createBook(request);

        final BookResponse book = controller.findBookByUuid("61057b52-7a8c-4657-ab3f-0c9f93a1b09e");
        Assertions.assertEquals("Clean Code", book.getBookName());
    }
}
