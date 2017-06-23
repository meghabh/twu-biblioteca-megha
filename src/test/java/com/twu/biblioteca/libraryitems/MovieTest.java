package com.twu.biblioteca.libraryitems;


import com.twu.biblioteca.libraryitems.Movie;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MovieTest {
    @Test
    public void twoMoviesWithSameInstanceAndSamePropertiesShouldBeEqual(){
        Movie movie1=new Movie("Doctor Strange", 2016, "Scott Decrrickson", 5);
        Movie movie2=new Movie("Doctor Strange", 2016, "Scott Decrrickson", 5);

        assertEquals(movie1,movie2);
    }
}
