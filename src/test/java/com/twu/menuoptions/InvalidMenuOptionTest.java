package com.twu.menuoptions;


import com.twu.biblioteca.Output;
import com.twu.biblioteca.Repository;
import com.twu.models.TestInputReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvalidMenuOptionTest {
    @Test
    public void shouldNotifyUserForInvalidOption() {
        String invalidOption="15";
        Output expectedOutputMessages=new Output("Select a valid option\n");
        TestInputReader inputReader = new TestInputReader(invalidOption);
        InvalidMenuOption invalidMenuOption = new InvalidMenuOption();
        Repository repository=new Repository();
        Output actualOutput=invalidMenuOption.performAction(inputReader, repository);

        assertEquals(expectedOutputMessages, actualOutput);

    }

}
