package com.twu.biblioteca.menumodels;


import com.twu.biblioteca.UserAuthentication;
import com.twu.models.TestCustomerMenu;
import com.twu.models.TestOutputWriter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerMenuTest {
    @Test
    public void shouldDisplayMethod(){
        TestOutputWriter outputWriter=new TestOutputWriter();
        UserAuthentication userAuthentication=new UserAuthentication();
        TestCustomerMenu testCustomerMenu=new TestCustomerMenu(outputWriter,userAuthentication);

        testCustomerMenu.displayMenuOptions();
        testCustomerMenu.getMenuOption(null);

        assertEquals(true,testCustomerMenu.isSuperCalled());
    }
}
