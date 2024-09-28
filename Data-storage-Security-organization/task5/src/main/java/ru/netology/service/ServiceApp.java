package ru.netology.service;

import ru.netology.entity.Persons;

import java.util.List;
import java.util.Optional;

public interface ServiceApp {

    List<Persons> getPersonsByAge(Integer age);

    List<Persons> getPersonsByCity(String city);

    Optional<Persons> getPersonsByNameAndSurname(String name, String surname);
}