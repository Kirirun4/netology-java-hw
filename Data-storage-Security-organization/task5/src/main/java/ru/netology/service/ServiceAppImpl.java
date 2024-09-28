package ru.netology.service;

import ru.netology.entity.Persons;
import ru.netology.repository.PersonsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ServiceAppImpl implements ServiceApp {

    private final PersonsRepository personsRepository;

    @Override
    public List<Persons> getPersonsByCity(String city) {
        return personsRepository.findByCity(city);
    }

    @Override
    public List<Persons> getPersonsByAge(Integer age) {
        return personsRepository.findByAgeLessThanOrderByAge(age);
    }

    @Override
    public Optional<Persons> getPersonsByNameAndSurname(String name, String surname) {
        return personsRepository.findByNameAndSurname(name, surname);
    }
}