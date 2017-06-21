package com.twu.biblioteca;


import java.util.HashMap;
import java.util.Map;

public class LibrarianAuthentication {
    private Map<Librarian, Password> credentials;

    LibrarianAuthentication() {
        credentials = new HashMap<>();
        addLibrarians();
    }

    private void addLibrarians() {
        credentials.put(new Librarian("Ram", "123-1236"), new Password("Ram@123"));
    }

    public Librarian validateCredentials(String libraryNumber, String password) {
        for (Map.Entry<Librarian, Password> credential : credentials.entrySet()) {
            if (credential.getKey().libraryNumber.equals(libraryNumber) && credential.getValue().password.equals(password)) {
                return credential.getKey();
            }
        }
        return null;
    }
}
