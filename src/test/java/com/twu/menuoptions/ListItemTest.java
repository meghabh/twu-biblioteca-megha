package com.twu.menuoptions;

import com.twu.biblioteca.Repository;
import com.twu.biblioteca.Output;
import com.twu.models.TestInputReader;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ListItemTest {

    private Output getExpectedListOfBooks() {
        ArrayList<String> expectedListOfBooks = new ArrayList<>();
        expectedListOfBooks.add("Head First Java      | Kathy Sierra,Bert Bates   | 2015\n");
        expectedListOfBooks.add("Native Son           | Richard Wrigh             | 1940\n");
        expectedListOfBooks.add("Animal Farm          | George Orwell             | 1945\n");
        return new Output(expectedListOfBooks);
    }

    private Output getExpectedListOfMovies() {
        ArrayList<String> expectedlistOfMovies = new ArrayList<>();
        expectedlistOfMovies.add("AirLift              | 2016     | Raja Krishna Menon   | 4.0\n");
        expectedlistOfMovies.add("Doctor Strange       | 2016     | Scott Decrrickson    | 5.0\n");
        return new Output(expectedlistOfMovies);


    }

    @Test
    public void shouldDisplayListOfBooksWhenUserChoosesListBooks() {
        String listBookOption = "1";
        TestInputReader inputReader = new TestInputReader(listBookOption);
        Repository repository = new Repository();
        ListItems listItems = new ListItems("Book");
        Output expectedOutputMessages = getExpectedListOfBooks();
        Output actualOutput = listItems.performAction(inputReader, repository);

        assertEquals(expectedOutputMessages, actualOutput);
    }

    @Test
    public void shouldDisplayListOfBooksWhenUserChoosesListMovies() {
        String listBookOption = "2";
        TestInputReader inputReader = new TestInputReader(listBookOption);
        Repository repository = new Repository();
        ListItems listitem = new ListItems("Movie");
        Output expectedOutputMessages = getExpectedListOfMovies();
        Output actualOutput = listitem.performAction(inputReader, repository);

        assertEquals(expectedOutputMessages, actualOutput);

    }

}
