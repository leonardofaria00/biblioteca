package br.edu.infnet.biblioteca.application.controller.student;

import br.edu.infnet.biblioteca.application.model.data.StudentRequest;
import br.edu.infnet.biblioteca.domain.model.data.student.StudentResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.UUID;

@SpringBootTest
class GetStudentControllerTest {

    @Autowired
    private StudentController studentController;

    @Test
    void getStudentByUuidWithSuccess() {
        StudentRequest studentRequest = new StudentRequest();
        studentRequest.setName("Leonardo Gloria");
        studentRequest.setAge(LocalDate.of(1994, 1, 15));
        studentController.createStudent(studentRequest);

        ResponseEntity<StudentResponse> studentResponse = studentController.getStudentByUuid(UUID.randomUUID().toString());
        Assertions.assertEquals(HttpStatus.OK, studentResponse.getStatusCode());
    }
}
