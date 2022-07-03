package br.edu.infnet.biblioteca.application.controller.student;

import br.edu.infnet.biblioteca.application.model.data.StudentRequest;
import br.edu.infnet.biblioteca.domain.model.data.StudentResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.UUID;

import static java.util.Objects.requireNonNull;

@SpringBootTest
class StudentControllerTest {

    @Autowired
    private StudentController studentController;

    @Test
    void createStudentWithSuccess() {
        StudentRequest studentRequest = new StudentRequest();
        studentRequest.setName("Leonardo Gloria");
        studentRequest.setAge(LocalDate.of(1994, 1, 15));

        final ResponseEntity<StudentResponse> studentResponse = studentController.createStudent(studentRequest);
        Assertions.assertEquals(HttpStatus.OK, studentResponse.getStatusCode());
        Assertions.assertEquals(studentRequest.getName(), requireNonNull(studentResponse.getBody()).getName());
    }

    @Test
    void getStudentByUuidWithSuccess() {
        createStudentWithSuccess();
        ResponseEntity<StudentResponse> studentResponse = studentController.getStudentByUuid(UUID.randomUUID().toString());
        Assertions.assertEquals(HttpStatus.OK, studentResponse.getStatusCode());
    }
}
