package com.twu.menuoptions;

import com.twu.biblioteca.Output;
import com.twu.models.TestInputReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogOutTest {
    @Test
    public void userShouldLogOutWhenUserChoosesToLogout(){
        String logoutOption="7";
        TestInputReader inputReader = new TestInputReader(logoutOption);
        Logout logOut=new Logout();

        Output expectedOutputMessages = new Output("Successful Logout\n");

        Output actualOutput = logOut.performAction(inputReader,null);

        assertEquals(expectedOutputMessages, actualOutput);

    }

}
