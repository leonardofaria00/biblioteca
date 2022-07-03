package br.edu.infnet.biblioteca.domain.repository;

import br.edu.infnet.biblioteca.domain.model.data.student.Student;

public interface StudentRepository {

    Student createStudent(Student student);

    Student getStudentByUuid(String studentUuid);
}
