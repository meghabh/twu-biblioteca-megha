package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class UserAuthentication {
    public static final String LOGIN_SUCCESSFUL = "Login successful\n";
    public static final String LOGIN_UNSUCCESSFUL="Login unSuccessful\n";
    private Map<User, Password> credentials;

    public UserAuthentication() {
        credentials = new HashMap<>();
        addUsers();
    }

    private void addUsers() {
        credentials.put(new User("Bob", "bob@gmail.com", "Bangalore", "+91-9867453565", "123-1234"), new Password("Bob@123"));
        credentials.put(new User("Rina", "rina@gmail.com", "Mysore", "+91-9867876543", "123-1235"), new Password("Rina@Mysore"));
    }

    public String validateCredentials(String userLibraryNumber, String password) {
        for (Map.Entry<User, Password> credential : credentials.entrySet()) {
            if (credential.getKey().libraryNumber.equals(userLibraryNumber) && credential.getValue().password.equals(password)) {
                //Set User
                return LOGIN_SUCCESSFUL;
            }
        }
        return LOGIN_UNSUCCESSFUL;

    }
}
