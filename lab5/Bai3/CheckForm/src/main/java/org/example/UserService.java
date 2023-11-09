package org.example;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private static UserService service = null;
    private static Map<String, String> users;
    static {
        users = new HashMap<>();
        users.put("123456","123");
        users.put("1234567","123");
    }

    public static UserService getInstance() {
        if (service == null)
            return new UserService();
        return service;
    }

    public User login(String username, String pass) {
        if(users.containsKey(username) && users.get(username).equals(pass)) {
            return new User(username, pass);
        }
        return null;
    }

    public boolean register(String username, String pass) {
        if(!users.containsKey(username)) {
            users.put(username, pass);
            return true;
        }
        return false;
    }
}
