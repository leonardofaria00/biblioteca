package br.edu.infnet.biblioteca.domain.service;

import br.edu.infnet.biblioteca.application.model.data.StudentRequest;
import br.edu.infnet.biblioteca.domain.model.data.student.Student;

public interface StudentService {

    Student createStudent(StudentRequest studentRequest);

    Student getStudentByUuid(String studentUuid);
}
