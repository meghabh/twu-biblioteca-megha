package com.twu.biblioteca;


public class User {
    String userName, email, address, phoneNumber, libraryNumber;

    public User(String name, String email, String address, String phoneNumber, String libraryNumber) {
        this.userName = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.libraryNumber = libraryNumber;
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        if (this.userName == user.userName && this.libraryNumber == user.libraryNumber) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %-25s | %-12s | %s", userName,email,phoneNumber,libraryNumber);
    }
}
