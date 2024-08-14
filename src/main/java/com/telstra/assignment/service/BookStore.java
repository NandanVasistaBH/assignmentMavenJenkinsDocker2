package com.telstra.assignment.service;
import java.util.ArrayList;

import com.telstra.assignment.model.Book;

public class BookStore{
    ArrayList<Book> bookColletion;
    public BookStore(){
        bookColletion= new ArrayList<>();
    }
    public void addBook(Book b){
        bookColletion.add(b);
    }
    public void searchByAuthor(String author){
        boolean found=false;
        for(Book book: bookColletion ){
            if(book.getAuthor().equals(author)){
                System.out.println(book);
                found=true;
            }
        }
        if(found==false) System.out.println("there are no books of that author in the store");
    }
    public void searchByTitle(String title){
        boolean found=false;
        for(Book book: bookColletion ){
            if(book.getTitle().equals(title)){
                System.out.println(book);
                found=true;
            }
        }
        if(found==false) System.out.println("there are no books of that title in the store");
    }
    public void displayAll(){
        System.out.println(bookColletion);
    }
}