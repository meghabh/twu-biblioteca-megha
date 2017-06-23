package com.twu.biblioteca.menumodels;


import com.twu.biblioteca.Output;
import com.twu.biblioteca.UserAuthentication;
import com.twu.biblioteca.menumodels.CustomerMenu;
import com.twu.biblioteca.menumodels.LibrarianMenu;
import com.twu.biblioteca.menumodels.Menu;
import com.twu.models.TestLibrarianMenu;
import com.twu.models.TestOutputWriter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibrarianMenuTest {
    @Test
    public void shouldDisplayMethod(){
        TestOutputWriter outputWriter=new TestOutputWriter();
        UserAuthentication userAuthentication=new UserAuthentication();
        TestLibrarianMenu testLibrarianMenu=new TestLibrarianMenu(outputWriter,userAuthentication);

        testLibrarianMenu.displayMenuOptions();
        testLibrarianMenu.getMenuOption(null);

        assertEquals(true,testLibrarianMenu.isSuperCalled());
    }
    @Test
    public void ShouldDisplayMenuOptions() {
        List<Output> expectedOutputMessage=new ArrayList<>();
        TestOutputWriter testOutputWriter = new TestOutputWriter();
        expectedOutputMessage.add(getExpectedMenuList());
        UserAuthentication userAuthentication=new UserAuthentication();
        Menu menu = new LibrarianMenu(testOutputWriter,userAuthentication );

        menu.displayMenuOptions();

        assertEquals(expectedOutputMessage,testOutputWriter.getOutput());
    }

    private Output getExpectedMenuList() {
        ArrayList<String> expectedMenuList = new ArrayList<>();
        expectedMenuList.add("1 List CheckedOutBooks\n");
        expectedMenuList.add("2 List CheckedOutMovies\n");
        expectedMenuList.add("3 Logout\n");
        return new Output(expectedMenuList);
    }

}
