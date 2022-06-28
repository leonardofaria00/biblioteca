package br.edu.infnet.biblioteca.application.model.data;

import java.time.LocalDate;

public class StudentRequest {

    private String name;
    private LocalDate age;
    private String registry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }
}
