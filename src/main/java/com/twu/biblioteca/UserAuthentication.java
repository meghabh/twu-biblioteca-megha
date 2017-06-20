package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class UserAuthentication {
    private Map<User, Password> credentials;

    UserAuthentication() {
        credentials = new HashMap<>();
        addUsers();
    }

    private void addUsers() {
        credentials.put(new User("Bob", "bob@gmail.com", "Bangalore", "+91-9867453565", "123-1234"), new Password("Bob@123"));
        credentials.put(new User("Rina", "rina@gmail.com", "Mysore", "+91-9867876543", "123-1235"), new Password("Rina@Mysore"));
    }

    public User validateCredentials(String userLibraryNumber, String password) {
        for (Map.Entry<User, Password> credential : credentials.entrySet()) {
            if (credential.getKey().libraryNumber == userLibraryNumber && credential.getValue().password == password) {
                return credential.getKey();
            }
        }
        return null;

    }
}
