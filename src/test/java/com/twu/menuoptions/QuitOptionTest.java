package com.twu.menuoptions;


import com.twu.biblioteca.Output;
import com.twu.biblioteca.Repository;
import com.twu.models.TestInputReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuitOptionTest {
    @Test
    public void applicationShouldStopWhenUserChoosesQuitOption() {
        String quit = "5";
        TestInputReader inputReader = new TestInputReader(quit);
        Quit quitOption = new Quit();
        Output expectedOutputMessages = new Output("Thank you");
        Repository repository = new Repository();

        Output actualOutput = quitOption.performAction(inputReader, repository);

        assertEquals(expectedOutputMessages, actualOutput);

    }


}
