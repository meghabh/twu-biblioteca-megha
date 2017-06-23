package com.twu.biblioteca.models;


public class User {
    private String userName;
    private String email;
    private String address;
    private String phoneNumber;
    private String libraryNumber;
    private boolean isAdmin;

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public User(String name, String email, String address, String phoneNumber, String libraryNumber, boolean isAdmin) {
        this.userName = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.libraryNumber = libraryNumber;
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %-25s | %-12s | %s", userName, email, phoneNumber, libraryNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (isAdmin != user.isAdmin) return false;
        if (!userName.equals(user.userName)) return false;
        if (!email.equals(user.email)) return false;
        if (!address.equals(user.address)) return false;
        if (!phoneNumber.equals(user.phoneNumber)) return false;
        return libraryNumber.equals(user.libraryNumber);
    }

}
