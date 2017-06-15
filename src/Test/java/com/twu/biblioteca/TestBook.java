package com.twu.biblioteca;

public class TestBook extends Book {
    TestBook(String title) {
        super(title);
    }
@Override
    public boolean equals(Object obj) {
        TestBook book = (TestBook) obj;
        if (this.title == book.title)
            return true;
        return false;

    }

}
