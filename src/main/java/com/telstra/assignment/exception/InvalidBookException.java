package com.telstra.assignment.exception;

import com.telstra.assignment.model.Book;

public class InvalidBookException extends Exception {
    public InvalidBookException(String msg){
        super(msg);
    }
    public static void checkBookValidation(Book b) throws InvalidBookException{
        if(b.getPrice()<0) throw new  InvalidBookException("Price can't be negative");
        String category = b.getCategory();
        if(!(category.equals("Science") || category.equals("Fiction") || category.equals("Technolory") || category.equals("Others"))){
            throw new  InvalidBookException("Category should be Science or Fiction or Technolory or Others ");
        }
        String bookID = b.getBookID();
        if(bookID.length()!=4 || !bookID.startsWith("B")){
            throw new InvalidBookException("bookID must be of length 4 and should start with 'B'");
        }


    }
    
}