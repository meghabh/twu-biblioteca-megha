package com.twu.biblioteca;


import com.twu.biblioteca.models.User;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UserTest {
    @Test
    public void twoUsersWithSameInstanceAndSamePropertiesShouldBeEqual() {
        User user1= new User("Bob", "bob@gmail.com", "Bangalore", "+91-9867453565", "123-1234", false);
        User user2= new User("Bob", "bob@gmail.com", "Bangalore", "+91-9867453565", "123-1234", false);

        assertEquals(user1,user2);
    }
    @Test
    public void librarianShouldBeAnAdmin(){
        User user= new User("Bob", "bob@gmail.com", "Bangalore", "+91-9867453565", "123-1234", true);

        assertEquals(true,user.isAdmin());
    }
}
