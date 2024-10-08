package ru.netology.AuthorizationService.services;

import org.springframework.stereotype.Service;
import ru.netology.AuthorizationService.exceptions.InvalidCredentials;
import ru.netology.AuthorizationService.exceptions.UnauthorizedUser;
import ru.netology.AuthorizationService.models.Authorities;
import ru.netology.AuthorizationService.models.User;
import ru.netology.AuthorizationService.repositories.UserRepository;

import java.util.List;

@Service
public class AuthorizationService {
    private final UserRepository userRepository;

    public AuthorizationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(User user) {
        if (isEmpty(user.getName()) || isEmpty(user.getPassword())) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user.getName(), user.getPassword());

        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }

}
