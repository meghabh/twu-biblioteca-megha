package com.twu.biblioteca;


public class Librarian {
    String librarianName, libraryNumber;

    Librarian(String librarianName, String libraryNumber) {
        this.librarianName = librarianName;
        this.libraryNumber = libraryNumber;
    }

    @Override
    public boolean equals(Object obj) {
        Librarian librarian = (Librarian) obj;
        if (this.librarianName == librarianName && this.libraryNumber == libraryNumber) {
            return true;
        }
        return false;
    }
}
