package ru.netology.repository;

import ru.netology.entity.Persons;
import ru.netology.entity.PersonsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonsRepository extends JpaRepository<Persons, PersonsId> {
    @Query("select p from Persons p where p.city = :city")
    List<Persons> findByCity(String city);

    @Query("select p from Persons p where p.age < :age ORDER BY p.age ASC ")
    List<Persons> findByAgeLessThanOrderByAge(Integer age);

    @Query("select p from Persons p where p.name = :name and p.surname = :surname")
    Optional<Persons> findByNameAndSurname(String name, String surname);
}
