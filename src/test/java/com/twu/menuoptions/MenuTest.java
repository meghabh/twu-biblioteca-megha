package com.twu.menuoptions;

import com.twu.biblioteca.CustomerMenu;
import com.twu.biblioteca.Menu;
import com.twu.biblioteca.Output;
import com.twu.models.TestOutputWriter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MenuTest {
    private Output getExpectedMenuList() {
        ArrayList<String> expectedMenuList = new ArrayList<>();
        expectedMenuList.add("1 Customer Profile\n");
        expectedMenuList.add("2 List Books\n");
        expectedMenuList.add("3 List Movies\n");
        expectedMenuList.add("4 Checkout Book\n");
        expectedMenuList.add("5 Checkout Movie\n");
        expectedMenuList.add("6 Return Book\n");
        expectedMenuList.add("7 Logout\n");
        return new Output(expectedMenuList);
    }

    @Test
    public void ShouldDisplayMenuOptions() {
        List<Output> expectedOutputMessage=new ArrayList<>();
        TestOutputWriter testOutputWriter = new TestOutputWriter();
        expectedOutputMessage.add(getExpectedMenuList());
        Menu menu = new CustomerMenu(testOutputWriter);
        menu.displayMenuOptions();

        assertEquals(expectedOutputMessage,testOutputWriter.getOutput());
    }



}
