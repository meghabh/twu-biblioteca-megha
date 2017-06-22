package com.twu.menuoptions;


import com.twu.models.TestCustomerMenu;
import com.twu.models.TestOutputWriter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerMenuTest {
    @Test
    public void shouldDisplayMethod(){
        TestOutputWriter outputWriter=new TestOutputWriter();
        TestCustomerMenu testCustomerMenu=new TestCustomerMenu(outputWriter);

        testCustomerMenu.displayMenuOptions();

        assertEquals(true,testCustomerMenu.isSuperCalled());
    }

}
