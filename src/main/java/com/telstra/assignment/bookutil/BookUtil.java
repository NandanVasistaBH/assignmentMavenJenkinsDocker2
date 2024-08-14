package com.telstra.assignment.bookutil;

import java.util.Scanner;

import com.telstra.assignment.exception.InvalidBookException;
import com.telstra.assignment.model.Book;
import com.telstra.assignment.service.BookStore;

public class BookUtil{
    public static void main(String[] args) {
        BookStore bs = new BookStore();
        System.out.println("enter data for 3 books");
        int no=1;
        Scanner sc = new Scanner(System.in);
        while(no<=3){
            System.out.println("enter data for book number "+ no);
            System.out.println("enter bookID,title,author,category,price");
            String bookID,title,author,category;
            float price;
            bookID=sc.next();
            title=sc.next();
            author=sc.next();
            category=sc.next();
            price=sc.nextFloat();
            Book b = new Book(bookID, title, author, category, price);
            try{
               InvalidBookException.checkBookValidation(b); 
               bs.addBook(b);
               no++;
            }
            catch(InvalidBookException e){
                System.out.println(e);
                System.out.println();
                System.out.println("enter correct details");
            }
            
        }

        System.out.println("enter name of the author to be searched");
        String author = sc.next();
        bs.searchByAuthor(author);

        System.out.println("enter name of the Title to be searched");
        String Title = sc.next();
        bs.searchByTitle(Title);
         
        System.out.println("display all");
        bs.displayAll();


        sc.close();

    }
}