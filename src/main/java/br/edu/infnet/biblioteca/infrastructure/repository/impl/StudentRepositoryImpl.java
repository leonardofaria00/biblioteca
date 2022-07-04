package br.edu.infnet.biblioteca.infrastructure.repository.impl;

import br.edu.infnet.biblioteca.domain.model.builder.StudentBuilder;
import br.edu.infnet.biblioteca.domain.model.data.student.Student;
import br.edu.infnet.biblioteca.domain.model.mapper.StudentMapper;
import br.edu.infnet.biblioteca.domain.repository.StudentRepository;
import br.edu.infnet.biblioteca.infrastructure.model.data.student.StudentDocument;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static final ArrayList<StudentDocument> STUDENT_DOCUMENT_ARRAY_LIST = new ArrayList<>();

    private final StudentMapper studentMapper;

    public StudentRepositoryImpl(final StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public Student createStudent(final Student student) {
        try {
            System.out.printf("Try create a Student with name: %s", student.getName());
            final StudentDocument studentDocument = new StudentBuilder()
                    .createUuid()
                    .createName(student.getName())
                    .createAge(student.getAge())
                    .createRegistry(student.getRegistry())
                    .createDate()
                    .updateDate()
                    .build();

            // TODO: Salvar na base de dados.
            STUDENT_DOCUMENT_ARRAY_LIST.add(studentDocument);

            return studentMapper.convertStudentDocumentToStudent(studentDocument);
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Student getStudentByUuid(final String studentUuid) {
        try {
            // TODO Buscar estudante por uuid.
            StudentDocument studentDocument = STUDENT_DOCUMENT_ARRAY_LIST.get(0);

            return studentMapper.convertStudentDocumentToStudent(studentDocument);
        } catch (final Exception e) {
            throw e;
        }
    }
}
