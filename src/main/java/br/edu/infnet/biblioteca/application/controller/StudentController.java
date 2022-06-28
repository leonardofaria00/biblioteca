package br.edu.infnet.biblioteca.application.controller;

import br.edu.infnet.biblioteca.application.model.data.StudentRequest;
import br.edu.infnet.biblioteca.domain.service.StudentService;
import br.edu.infnet.biblioteca.infrastructure.model.data.StudentDocument;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biblioteca/v1/estudante")
public class StudentController {

    private final StudentService studentService;

    public StudentController(final StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StudentDocument> createStudent(@RequestBody final StudentRequest studentRequest) {
        final StudentDocument student = studentService.createStudent(studentRequest);
        return ResponseEntity.ok(student);
    }
}
