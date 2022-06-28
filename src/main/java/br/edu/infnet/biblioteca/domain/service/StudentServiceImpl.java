package br.edu.infnet.biblioteca.domain.service;

import br.edu.infnet.biblioteca.application.model.data.StudentRequest;
import br.edu.infnet.biblioteca.domain.repository.StudentRepository;
import br.edu.infnet.biblioteca.infrastructure.model.data.StudentDocument;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(final StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentDocument createStudent(final StudentRequest studentRequest) {
        studentRequest.setRegistry(UUID.randomUUID().toString());
        return studentRepository.createStudent(studentRequest);
    }
}
