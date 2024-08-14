package com.telstra.assignment;
import org.junit.Test;
import com.telstra.assignment.model.Book;
import static org.junit.Assert.assertEquals;
public class BookUtilTest {
    @Test
    public void testGreating(){
        Book b = new Book("B101","HarryPotter","JK","Fiction",1000);
        assertEquals("JK",b.getAuthor());
    }
}
