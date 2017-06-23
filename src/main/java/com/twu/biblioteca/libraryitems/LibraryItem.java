package com.twu.biblioteca.libraryitems;


public class LibraryItem {
    private Item item;
    private String type;

    public LibraryItem(Item item, String type) {
        this.item = item;
        this.type = type;
    }

    public Item getItem() {
        return item;
    }

    public String getType() {
        return type;
    }
}
