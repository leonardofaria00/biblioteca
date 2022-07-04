package br.edu.infnet.biblioteca.domain.model.mapper;

import br.edu.infnet.biblioteca.application.model.data.BookResponse;
import br.edu.infnet.biblioteca.domain.model.data.book.Book;
import br.edu.infnet.biblioteca.domain.model.data.book.BookRequest;
import br.edu.infnet.biblioteca.infrastructure.model.data.book.BookDocument;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.time.LocalDate;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BookMapper {
    @Mapping(target = "uuid", source = "uuid")
    @Mapping(target = "createDate", source = "localDate")
    @Mapping(target = "updateDate", source = "localDate")
    BookDocument convertBookToBookDocument(Book book, String uuid, LocalDate localDate);

    Book convertRequestToBook(BookRequest bookRequest);

    Book convertBookDocumentToBook(BookDocument document);

    BookResponse convertBookToBookResponse(Book book);
}
