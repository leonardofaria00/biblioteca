package br.edu.infnet.biblioteca.domain.service.student;

import br.edu.infnet.biblioteca.application.model.data.StudentRequest;
import br.edu.infnet.biblioteca.domain.model.data.student.Student;
import br.edu.infnet.biblioteca.domain.model.mapper.StudentMapper;
import br.edu.infnet.biblioteca.domain.repository.StudentRepository;
import br.edu.infnet.biblioteca.domain.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    private final StudentMapper studentMapper;

    public StudentServiceImpl(final StudentRepository studentRepository, final StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    @Override
    public Student createStudent(final StudentRequest studentRequest) {
        final Student student = studentMapper.convertStudentRequestToStudent(studentRequest);
        student.setRegistry(UUID.randomUUID().toString());
        return studentRepository.createStudent(student);
    }

    @Override
    public Student getStudentByUuid(final String studentUuid) {
        return studentRepository.getStudentByUuid(studentUuid);
    }
}
