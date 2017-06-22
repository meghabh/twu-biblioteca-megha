package com.twu.biblioteca;


import java.util.HashMap;
import java.util.Map;

public class LibrarianAuthentication {
    private static final String SUCCESSFUL_LOGIN = "Login successful\n";
    public static final String UN_SUCCESSFUL_LOGIN = "Failed to Login\n";
    private Map<Librarian, Password> credentials;

    public LibrarianAuthentication() {
        credentials = new HashMap<>();
        addLibrarians();
    }

    private void addLibrarians() {
        credentials.put(new Librarian("Ram", "123-1236"), new Password("Ram@123"));
    }

    public String validateCredentials(String libraryNumber, String password) {
        for (Map.Entry<Librarian, Password> credential : credentials.entrySet()) {
            if (credential.getKey().libraryNumber.equals(libraryNumber) && credential.getValue().password.equals(password)) {
                Session.setType("librarianMenu");
                Session.setUser(null);
                return SUCCESSFUL_LOGIN;
            }
        }
        return UN_SUCCESSFUL_LOGIN;
    }
}
