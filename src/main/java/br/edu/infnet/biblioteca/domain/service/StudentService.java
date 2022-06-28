package br.edu.infnet.biblioteca.domain.service;

import br.edu.infnet.biblioteca.application.model.data.StudentRequest;
import br.edu.infnet.biblioteca.infrastructure.model.data.StudentDocument;

public interface StudentService {
    StudentDocument createStudent(StudentRequest studentRequest);
}
