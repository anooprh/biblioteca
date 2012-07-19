package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 7/17/12
 * Time: 7:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryTest {

    @Test
    public void mustBeAbleToDepositFirstBookInLibrary(){
        Library libraryObject = new Library();
        Book bookObject = new Book();

        assertTrue(libraryObject.addBook(bookObject));
    }

    @Test
    public void mustBeAbleDepositFirstBookbyItsISBN(){
        Library libraryObject = new Library();
        Book bookObject = new Book("1234567890123");     //A Dummy ISBN Number

        assertTrue(libraryObject.addBook(bookObject));
    }

    @Test
    public void reserveBookbyItsISBN(){
        Library libraryObject = new Library();

        assertTrue(libraryObject.reserveBook("1234567890123"));     //A Dummy ISBN Value
    }

    @Test
    public void findBookbyItsISBN(){
        Library libraryObject = new Library();

        assertTrue(libraryObject.findBook("1234567890123"));     //A Dummy ISBN Value
    }

    @Test
    public void mustBeAbleToAddMoreThanOneBooks(){
        Book[] bookobjects = new Book[2];
        bookobjects[0] = new Book("1234567890123","SampleTitle","SampleAuthor","SamplePublisher",1,2012,5);
        bookobjects[1] = new Book("3210987654321","SamplTitle1","SamplAuthor1","SamplPublisher1",1,2011,3);
        Library libraryobject = new Library();
        assertTrue(libraryobject.addBook(bookobjects));

    }

    @Test
    public void mustBeAbleToViewAllBooks(){
        Book[] bookobjects = new Book[2];
        bookobjects[0] = new Book("1234567890123","SampleTitle","SampleAuthor","SamplePublisher",1,2012,5);
        bookobjects[1] = new Book("3210987654321","SamplTitle1","SamplAuthor1","SamplPublisher1",1,2011,3);

        Library libraryobject = new Library();
        assertTrue(libraryobject.addBook(bookobjects));
        assertTrue(libraryobject.displayAllBooks());

    }

}
