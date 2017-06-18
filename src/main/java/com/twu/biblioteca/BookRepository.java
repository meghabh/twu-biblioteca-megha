package com.twu.biblioteca;

import java.util.*;

public class BookRepository {
    private Map<Book, BookStatus> books;
    private List<Book> availableBooks;

    public BookRepository() {
        books = new LinkedHashMap<>();
        addBooks();
        availableBooks = new ArrayList<>();
    }

    private void addBooks() {
        books.put(new Book("Head First Java", "Kathy Sierra,Bert Bates", 2015), BookStatus.AVAILABLE);
        books.put(new Book("Native Son", "Richard Wrigh", 1940), BookStatus.AVAILABLE);
        books.put(new Book("Animal Farm", "George Orwell", 1945), BookStatus.AVAILABLE);
    }

    public List<Book> getAvailableBooks() {
        List<Book> bookList = new ArrayList<>();
        for (Map.Entry<Book, BookStatus> option : books.entrySet()) {
            if (option.getValue() == BookStatus.AVAILABLE) {
                bookList.add(option.getKey());
            }
        }
        return bookList;

    }

    public String checkout(String userInput) {
        String successfulCheckoutMessage = "Thank you! Enjoy the book\n";
        String unSuccessfulCheckoutMessage = "book is not available\n";
        availableBooks = getAvailableBooks();
        for (Book book : availableBooks) {
            if (book.title.equals(userInput)) {
                setAvailabilityStatus(book);
                return successfulCheckoutMessage;
            }
        }
        return unSuccessfulCheckoutMessage;
    }

    public void setAvailabilityStatus(Book book) {
        for (Map.Entry<Book, BookStatus> option : books.entrySet()) {
            if (option.getKey() == book) {
                option.setValue(BookStatus.NOTAVAILABLE);
            }
        }
    }
}
