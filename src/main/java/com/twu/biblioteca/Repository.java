package com.twu.biblioteca;

import java.util.*;


public class Repository {
    private Map<LibraryItem, User> checkedOutItems;
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
            if (item.type == type)
                items.add(item.getItem());
        }
        return items;
    }


    public String checkoutItem(String itemName, String type, User user) {
        for (LibraryItem item : availableItems) {
            if (item.getItem().getItemName().equals(itemName) && item.type == type) {
                checkedOutItems.put(item, user);
                availableItems.remove(item);
                return "Thank you! Enjoy the " + type.toLowerCase() + "\n";
            }
        }
        return type + " is not available\n";
    }


    public String returnItem(String bookName, String type, User user) {
        for (Map.Entry<LibraryItem, User> libraryItem : checkedOutItems.entrySet()) {
            Item item = libraryItem.getKey().getItem();
            if (item.getItemName().equals(bookName) && libraryItem.getKey().type == type) {
                return "Thank you for returning the " + type.toLowerCase() + "\n";
            }
        }
        return "That is not a valid " + type.toLowerCase() + " to return\n";

    }
}
