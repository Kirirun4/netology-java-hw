package ru.netology.AuthorizationService.repositories;

import org.springframework.stereotype.Repository;
import ru.netology.AuthorizationService.models.Authorities;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        return List.of();
    }
}

