package br.edu.infnet.biblioteca.application.controller;

import br.edu.infnet.biblioteca.application.model.data.StudentRequest;
import br.edu.infnet.biblioteca.infrastructure.model.data.StudentDocument;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;

@SpringBootTest
class StudentControllerTest {

    @Autowired
    private StudentController studentController;

    @Test
    void createStudentWithSuccess() {
        StudentRequest studentRequest = new StudentRequest();
        studentRequest.setName("Leonardo Gloria");
        studentRequest.setAge(LocalDate.of(1994, 1, 15));

        final ResponseEntity<StudentDocument> studentResponse = studentController.createStudent(studentRequest);
        Assertions.assertEquals(HttpStatus.OK, studentResponse.getStatusCode());
    }
}
