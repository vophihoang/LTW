package org.example.dao;

import java.io.IOException;
import java.util.Properties;

public class DBProperties {
    private static Properties properties = new Properties();
    static {
        try {
            properties.load(DBProperties.class.getClassLoader().getResourceAsStream("DB.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static String host = properties.getProperty("db.host");
    private static String port = properties.getProperty("db.port");
    private static String username = properties.getProperty("db.username");
    private static String password = properties.getProperty("db.passsword");
    private static String dbName = properties.getProperty("db.name");

    public static String getHost() {
        return host;
    }

    public static String getPort() {
        return port;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }

    public static String getDbName() {
        return dbName;
    }
}
