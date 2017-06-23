package com.twu.biblioteca.libraryitems;

import com.twu.biblioteca.libraryitems.Book;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {
    @Test
    public void twoBooksWithSameInstanceAndSamePropertiesShouldBeEqual(){
       Book book1= new Book("Head First Java", "Kathy Sierra,Bert Bates", 2015);
       Book book2= new Book("Head First Java", "Kathy Sierra,Bert Bates", 2015);

       assertEquals(book1,book2);

    }
}
