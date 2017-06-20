package com.twu.menuoptions;

import com.twu.biblioteca.Output;
import com.twu.biblioteca.Repository;
import com.twu.io.InputReader;


public interface MenuOptions {
    Output performAction(InputReader consoleInputReader, Repository repository);
}
