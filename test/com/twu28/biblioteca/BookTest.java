package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 7/17/12
 * Time: 7:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookTest {

    @Test
    public void newBookMustBeAvailable(){
        Book bookObject = new Book();
        assertTrue(bookObject.isAvailable());
    }

    @Test
    public void createNewBookWithISBNOnly(){
        Book bookobject = new Book();

    }

    @Test
    public void createNewBook(){
        Book bookobject = new Book("1234567890123","Title","Author","Publisher",1,2012,5);
                                            //"ISBN","Title","Author","Publisher",Edition,Year,Number Of Copies
        assertNotNull(bookobject);
    }

    @Test
    public void newBookMustBeReserved(){
        Book bookobject = new Book();
        assertTrue(bookobject.reserveBook());
    }

    @Test
    public void reservedBookMustNotBeAvailable(){
        Book bookobject = new Book();
        bookobject.reserveBook();

        assertFalse(bookobject.isAvailable());
    }
}