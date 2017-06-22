package com.twu.biblioteca;

public class Session {

    private static User user;
    private static String type = "mainMenu";


    public static void setUser(User user) {
        Session.user = user;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Session.type = type;
    }

    public static User getUser() {
        return user;
    }
}
