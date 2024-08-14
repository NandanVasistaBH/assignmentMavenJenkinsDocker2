package com.telstra.assignment.model;
public class Book {
    private String bookID,title,author,category;
    float price;
    public Book(String bookID, String title, String author, String category, float price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Book : [bookID=" + bookID + ", title=" + title + ", author=" + author + ", category=" + category
                + ", price=" + price + "]";
    }

    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }
    
    
}