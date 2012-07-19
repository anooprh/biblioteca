package com.twu28.biblioteca;

import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void findBookbyItsISBN(){
        int index = -1;                   //Index to the Book if Present in the Library.If not present,it's -1
        Book[] bookobjects = new Book[2];
        bookobjects[0] = new Book("1234567890123","SampleTitle","SampleAuthor","SamplePublisher",1,2012,5);
        bookobjects[1] = new Book("3210987654321","SamplTitle1","SamplAuthor1","SamplPublisher1",1,2011,3);

        Library libraryobject = new Library();
        assertTrue(libraryobject.addBook(bookobjects));
        index = libraryobject.findBook("3210987654321") ;           //A Dummy ISBN Value
        assertNotSame(-1, index);
        //System.out.println("Test Index = "+index);
    }

    @Test
    public void reserveBookbyItsISBN(){
        Book[] bookobjects = new Book[2];
        bookobjects[0] = new Book("1234567890123","SampleTitle","SampleAuthor","SamplePublisher",1,2012,5);
        bookobjects[1] = new Book("3210987654321","SamplTitle1","SamplAuthor1","SamplPublisher1",1,2011,3);

        Library libraryobject = new Library();
        assertTrue(libraryobject.addBook(bookobjects));
        assertTrue(libraryobject.reserveBook("1234567890123"));     //A Dummy ISBN Value
    }

    @Test
    public void addAMemberToTheLibrary(){
        User userobject = new User("Sample Name",'M',25,1232) ;
        Library libraryobject = new Library();

        assertTrue(libraryobject.addNewMember(userobject));

    }
    @Test
    public void addMoreThanOneMembersToTheLibrary(){
        User[] userobjects = new User[2];
        userobjects[0] = new User("Sample Name",'M',25,1232);
        userobjects[1] = new User("Sampl Name1",'F',20,1000);

        Library libraryobject = new Library();

        assertTrue(libraryobject.addNewMember(userobjects));

    }

    @Test
    public void findUserByHisIDNumber(){

        int index = -1;                   //Index to a Member if Present in the Library.If not present,it's -1
        User[] userobjects = new User[2];
        userobjects[0] = new User("Sample Name",'M',25,1232);
        userobjects[1] = new User("Sampl Name1",'F',20,1000);

        Library libraryobject = new Library();

        assertTrue(libraryobject.addNewMember(userobjects));
        index = libraryobject.findUser(1232) ;           //A Dummy Library ID
        assertNotSame(-1, index);

    }

}
