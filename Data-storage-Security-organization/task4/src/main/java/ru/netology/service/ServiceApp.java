package ru.netology.service;

import ru.netology.entity.Persons;
import ru.netology.repository.RepositoryApp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ServiceApp {

    private final RepositoryApp repositoryApp;

    public List<Persons> getCityOfLiving(String city) {
        return repositoryApp.getPersonsByCity(city);
    }
}