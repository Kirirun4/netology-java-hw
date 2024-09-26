package ru.netology.AuthorizationService.repositories;

import org.springframework.stereotype.Repository;
import ru.netology.AuthorizationService.models.Authorities;
import ru.netology.AuthorizationService.models.User;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Repository
public final class FakeUserRepository extends UserRepository {

    private final ConcurrentMap<String, User> users = new ConcurrentHashMap<>();

    public FakeUserRepository() {
        for (int i = 0; i <= 50; i++) {
            User user = new User("User " + i, "12345678");
            if (i % 2 == 0) {
                user.addAuthority(Authorities.READ);
            }
            if (i % 3 == 0) {
                user.addAuthority(Authorities.WRITE);
            }
            if (i % 7 == 0) {
                user.addAuthority(Authorities.DELETE);
            }
            users.put(user.getName(), user);
        }
    }

    @Override
    public List<Authorities> getUserAuthorities(String userName, String password) {
        User result = users.get(userName);
        if ((result != null) && (password.equals(result.getPassword()))) {
            return result.getAuthorities();
        } else {
            return List.of();
        }
    }
}
