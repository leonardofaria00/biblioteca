package br.edu.infnet.biblioteca.application.controller.student;

import br.edu.infnet.biblioteca.application.model.data.StudentRequest;
import br.edu.infnet.biblioteca.domain.model.data.StudentResponse;
import br.edu.infnet.biblioteca.domain.model.data.student.Student;
import br.edu.infnet.biblioteca.domain.model.mapper.StudentMapper;
import br.edu.infnet.biblioteca.domain.service.StudentService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/biblioteca/v1/estudante")
public class StudentController {

    private final StudentService studentService;
    private final StudentMapper studentMapper;

    public StudentController(final StudentService studentService, final StudentMapper studentMapper) {
        this.studentService = studentService;
        this.studentMapper = studentMapper;
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StudentResponse> createStudent(@RequestBody final StudentRequest studentRequest) {
        final Student student = studentService.createStudent(studentRequest);
        return ResponseEntity.ok(studentMapper.convertStudentToStudentResponse(student));
    }

    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StudentResponse> getStudentByUuid(@PathVariable final String StudentUuid) {
        final Student student = studentService.getStudentByUuid(StudentUuid);
        return ResponseEntity.ok(studentMapper.convertStudentToStudentResponse(student));
    }
}
