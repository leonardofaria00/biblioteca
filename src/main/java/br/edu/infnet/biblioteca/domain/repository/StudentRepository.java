package br.edu.infnet.biblioteca.domain.repository;

import br.edu.infnet.biblioteca.application.model.data.StudentRequest;
import br.edu.infnet.biblioteca.infrastructure.model.data.StudentDocument;

public interface StudentRepository {
    StudentDocument createStudent(StudentRequest studentRequest);
}
