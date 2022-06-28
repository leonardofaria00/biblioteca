package br.edu.infnet.biblioteca.domain.model.builder;

import br.edu.infnet.biblioteca.infrastructure.model.data.StudentDocument;

import java.time.LocalDate;
import java.util.UUID;

public class StudentBuilder {

    private static final LocalDate today = LocalDate.now();
    private String uuid;
    private String name;
    private LocalDate age;
    private String registry;
    private LocalDate createDate;
    private LocalDate updateDate;

    public StudentBuilder createUuid() {
        this.uuid = UUID.randomUUID().toString();
        return this;
    }

    public String getUuid() {
        return uuid;
    }

    public StudentBuilder createName(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentBuilder createAge(final LocalDate age) {
        this.age = age;
        return this;
    }

    public LocalDate getAge() {
        return age;
    }

    public StudentBuilder createRegistry(final String registry) {
        this.registry = registry;
        return this;
    }

    public String getRegistry() {
        return registry;
    }

    public StudentBuilder createDate() {
        this.createDate = today;
        return this;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public StudentBuilder updateDate() {
        this.updateDate = today;
        return this;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public StudentDocument build() {
        return new StudentDocument(this);
    }
}
