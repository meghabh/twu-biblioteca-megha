package com.twu.biblioteca;

import com.twu.biblioteca.models.Password;
import com.twu.biblioteca.models.User;

import java.util.HashMap;
import java.util.Map;

public class UserAuthentication {
    private static final String LOGIN_SUCCESSFUL = "Login successful\n";
    private static final String LOGIN_UNSUCCESSFUL = "Failed to login\n";
    private Map<User, Password> credentials;
    private User user;

    public UserAuthentication() {
        credentials = new HashMap<>();
        addUsers();
    }

    private void addUsers() {
        credentials.put(new User("Bob", "bob@gmail.com", "Bangalore", "+91-9867453565", "123-1234", false), new Password("Bob@123"));
        credentials.put(new User("Rina", "rina@gmail.com", "Mysore", "+91-9867876543", "123-1235", false), new Password("Rina@Mysore"));
        credentials.put(new User("Ram", "ram@gmail.com", "Mysore", "+91-9867876556", "123-1236", true), new Password("Ram@123"));

    }

    public String validateCredentials(String userLibraryNumber, String password) {
        for (Map.Entry<User, Password> credential : credentials.entrySet()) {
            if (credential.getKey().getLibraryNumber().equals(userLibraryNumber) && credential.getValue().getPassword().equals(password)) {
                this.user = credential.getKey();
                return LOGIN_SUCCESSFUL;
            }
        }
        return LOGIN_UNSUCCESSFUL;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
