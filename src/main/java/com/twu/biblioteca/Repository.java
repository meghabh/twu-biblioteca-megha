package com.twu.biblioteca;

import com.twu.biblioteca.libraryitems.Book;
import com.twu.biblioteca.libraryitems.Item;
import com.twu.biblioteca.libraryitems.LibraryItem;
import com.twu.biblioteca.libraryitems.Movie;

import java.util.*;


public class Repository {
    private Map<LibraryItem, String> checkedOutItems;
    private List<LibraryItem> availableItems;


    public Repository() {
        availableItems = new ArrayList<>();
        checkedOutItems = new LinkedHashMap<>();
        addItems();
    }

    private void addItems() {
        availableItems.add(new LibraryItem(new Book("Head First Java", "Kathy Sierra,Bert Bates", 2015), "Book"));
        availableItems.add(new LibraryItem(new Book("Native Son", "Richard Wrigh", 1940), "Book"));
        availableItems.add(new LibraryItem(new Book("Animal Farm", "George Orwell", 1945), "Book"));
        availableItems.add(new LibraryItem(new Movie("AirLift", 2016, "Raja Krishna Menon", 4), "Movie"));
        availableItems.add(new LibraryItem(new Movie("Doctor Strange", 2016, "Scott Decrrickson", 5), "Movie"));
    }

    public List<Item> getItems(String type) {
        List<Item> items = new ArrayList<>();
        for (LibraryItem item : availableItems) {
            if (item.getType().equals(type))
                items.add(item.getItem());
        }
        return items;
    }

    public List<String> getCheckedOutItems(String type) {
        List<String> items = new ArrayList<>();
        for (Map.Entry<LibraryItem, String> libraryItem : checkedOutItems.entrySet()) {
            if (libraryItem.getKey().getType().equals(type))
                items.add(libraryItem.getKey().getItem() + " id = " + libraryItem.getValue() + "\n");
        }
        return items;
    }

    public String checkoutItem(String itemName, String type, UserAuthentication userAuthentication) {
        for (LibraryItem item : availableItems) {
            if (item.getItem().getItemName().equals(itemName) && item.getType().equals(type)) {
                checkedOutItems.put(item, userAuthentication.getUser().getLibraryNumber());
                System.out.println(userAuthentication.getUser().getLibraryNumber());
                availableItems.remove(item);
                return "Thank you! Enjoy the " + type.toLowerCase() + "\n";
            }
        }
        return type + " is not available\n";
    }


    public String returnItem(String bookName, String type) {
        for (Map.Entry<LibraryItem, String> libraryItem : checkedOutItems.entrySet()) {
            Item item = libraryItem.getKey().getItem();
            if (item.getItemName().equals(bookName) && libraryItem.getKey().getType().equals(type)) {
                return "Thank you for returning the " + type.toLowerCase() + "\n";
            }
        }
        return "That is not a valid " + type.toLowerCase() + " to return\n";

    }
}
