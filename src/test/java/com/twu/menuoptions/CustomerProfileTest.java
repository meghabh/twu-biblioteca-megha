package com.twu.menuoptions;


import com.twu.biblioteca.Output;
import com.twu.biblioteca.UserAuthentication;
import com.twu.biblioteca.models.User;
import com.twu.models.TestInputReader;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerProfileTest {
    @Test
    public void shouldDisplayUserInformation(){
        String customerProfileOption = "1";
        TestInputReader inputReader = new TestInputReader(customerProfileOption);
        User user=new User("Bob", "bob@gmail.com", "Bangalore", "+91-9867453565", "123-1234",false );
        UserAuthentication userAuthentication=new UserAuthentication();
        userAuthentication.setUser(user);
        CustomerProfile customerProfile=new CustomerProfile(userAuthentication);
        Output expectedOutput=new Output(user.toString()+"\n");

        Output actualOutput=customerProfile.performAction(inputReader,null);

        assertEquals(expectedOutput,actualOutput);

    }


}
