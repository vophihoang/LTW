package org.example.dao;

import org.example.model.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserDao {
    public static User getUserByUsername(String username) {
        Optional<User> user = JDBIConnector.getInstance().withHandle(handle ->
             handle.createQuery("SELECT * FROM user WHERE username = ?")
                    .bind(0, username).mapToBean(User.class).stream().findFirst()

        );
        return user.orElse(null);
    }
    public static boolean register(String username, String password) {
        int result = JDBIConnector.getInstance().withHandle(handle ->
             handle.createUpdate("INSERT INTO user(username, password) VALUES(?, ?)")
                     .bind(0, username)
                     .bind(1, password)
                     .execute()
        );
       return result >= 1;
    }

    public static void main(String[] args) {
        List<User> users = JDBIConnector.getInstance().withHandle(h ->
                h.createQuery("SELECT * FROM user")
                        .mapToBean(User.class)
                        .stream()
                        .collect(Collectors.toList())
        );
        System.out.println(users);
    }
}
