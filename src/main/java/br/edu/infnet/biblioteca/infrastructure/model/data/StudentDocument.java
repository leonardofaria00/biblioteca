package br.edu.infnet.biblioteca.infrastructure.model.data;

import br.edu.infnet.biblioteca.domain.model.builder.StudentBuilder;

import java.time.LocalDate;

public class StudentDocument {
    private final String uuid;
    private final String name;
    private final LocalDate age;
    private final String registry;
    private final LocalDate createDate;
    private final LocalDate updateDate;

    public StudentDocument(final StudentBuilder studentBuilder) {
        this.uuid = studentBuilder.getUuid();
        this.name = studentBuilder.getName();
        this.age = studentBuilder.getAge();
        this.registry = studentBuilder.getRegistry();
        this.createDate = studentBuilder.getCreateDate();
        this.updateDate = studentBuilder.getUpdateDate();
    }

}
