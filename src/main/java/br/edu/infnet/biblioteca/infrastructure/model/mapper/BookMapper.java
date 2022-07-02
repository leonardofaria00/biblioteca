package br.edu.infnet.biblioteca.infrastructure.model.mapper;

import br.edu.infnet.biblioteca.application.model.data.BookResponse;
import br.edu.infnet.biblioteca.domain.model.data.BookRequest;
import br.edu.infnet.biblioteca.domain.model.data.BookStatus;
import br.edu.infnet.biblioteca.domain.model.data.book.Book;
import br.edu.infnet.biblioteca.infrastructure.model.data.book.BookDocument;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.time.LocalDate;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BookMapper {
    @Mapping(target = "createDate", source = "localDate")
    @Mapping(target = "updateDate", source = "localDate")
    BookDocument convertBookToBookDocument(Book book, String uuid, LocalDate localDate);

    @Mapping(target = "bookStatus", source = "status")
    Book convertRequestToBook(BookRequest bookRequest, BookStatus status);

    Book convertBookDocumentToBook(BookDocument document);

    BookResponse convertBookToBookResponse(Book book);
}
