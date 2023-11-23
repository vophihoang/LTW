package org.example.service;

import org.example.dao.UserDao;
import org.example.model.User;

public class UserService {
    private static UserService service = null;

    public static UserService getInstance() {
        if (service == null)
            return new UserService();
        return service;
    }

    public User login(String username, String pass) {
        User user = UserDao.getUserByUsername(username);
        if(user != null && user.getUsername().equals(username) && user.getPassword().equals(pass))
            return user;
        return null;
    }

    public boolean register(String username, String pass) {
        User user = UserDao.getUserByUsername(username);
        if (user == null) {
            return UserDao.register(username, pass);
        }
        return false;
    }
}
