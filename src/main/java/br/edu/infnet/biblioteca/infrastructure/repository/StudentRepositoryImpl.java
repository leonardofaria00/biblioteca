package br.edu.infnet.biblioteca.infrastructure.repository;

import br.edu.infnet.biblioteca.application.model.data.StudentRequest;
import br.edu.infnet.biblioteca.domain.model.builder.StudentBuilder;
import br.edu.infnet.biblioteca.domain.repository.StudentRepository;
import br.edu.infnet.biblioteca.infrastructure.model.data.StudentDocument;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @Override
    public StudentDocument createStudent(final StudentRequest studentRequest) {
        try {
            System.out.println("Try create a Student...");
            Thread.sleep(10);
            return new StudentBuilder()
                    .createUuid()
                    .createName(studentRequest.getName())
                    .createAge(studentRequest.getAge())
                    .createRegistry(studentRequest.getRegistry())
                    .createDate()
                    .updateDate()
                    .build();
        } catch (final InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
