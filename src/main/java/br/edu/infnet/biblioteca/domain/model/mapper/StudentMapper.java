package br.edu.infnet.biblioteca.domain.model.mapper;

import br.edu.infnet.biblioteca.application.model.data.StudentRequest;
import br.edu.infnet.biblioteca.domain.model.data.student.Student;
import br.edu.infnet.biblioteca.domain.model.data.student.StudentResponse;
import br.edu.infnet.biblioteca.infrastructure.model.data.student.StudentDocument;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentMapper {

    Student convertStudentRequestToStudent(StudentRequest studentRequest);

    Student convertStudentDocumentToStudent(StudentDocument studentDocument);

    StudentResponse convertStudentToStudentResponse(Student student);
}
