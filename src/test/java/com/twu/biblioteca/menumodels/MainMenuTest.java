package com.twu.biblioteca.menumodels;


import com.twu.biblioteca.UserAuthentication;
import com.twu.models.TestMainMenu;
import com.twu.models.TestOutputWriter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainMenuTest {
    @Test
    public void shouldDisplayMethod(){
        TestOutputWriter outputWriter=new TestOutputWriter();
        UserAuthentication userAuthentication=new UserAuthentication();
        TestMainMenu testMainMenu=new TestMainMenu(outputWriter,userAuthentication);

        testMainMenu.displayMenuOptions();
        testMainMenu.getMenuOption(null);

        assertEquals(true,testMainMenu.isSuperCalled());
    }

}
