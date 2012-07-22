package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 7/17/12
 * Time: 10:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserTest {

    @Test
    public void canCreateANewUser(){
        User userObject1 = new User("Sample Name",'M',25,1232);  //User Details - Name,Gender,Age,Library Number
        assertNotNull(userObject1);
    }

    @Test
    public void canANewUserBeAMemberOfTheLibrary(){
        User userObject = new User("SampleName",'M',25,1232);  //User Details - Name,Gender,Age,Library Number
        Library libraryobject = new Library();

        assertNotNull(userObject);
        assertTrue(userObject.addTothisLibrary(libraryobject));

    }

    @Test
    public void canViewUserDetailsRecordedInLibrary(){
        User userObject = new User("Sample Name",'M',25,1232);  //User Details - Name,Gender,Age,Library Number
        Library libraryobject = new Library();

        assertNotNull(userObject);
        assertTrue(userObject.addTothisLibrary(libraryobject));
        assertTrue(userObject.viewMyProfileInTheLibrary(libraryobject));

    }

    @Test
    public void canUserViewAllTheBooksInTheLibrary(){
        User userObject = new User("Sample Name",'M',25,1232);  //User Details - Name,Gender,Age,Library Number
        Library libraryobject = new Library();

        Book[] bookobjects = new Book[2];
        bookobjects[0] = new Book("1234567890123","SampleTitle","SampleAuthor","SamplePublisher",1,2012,5);
        bookobjects[1] = new Book("3210987654321","SamplTitle1","SamplAuthor1","SamplPublisher1",1,2011,3);
        libraryobject.addBook(bookobjects);

        assertNotNull(userObject);
        assertTrue(userObject.addTothisLibrary(libraryobject));
        assertTrue(userObject.viewAllBooksInMyLibrary());
    }

    @Test
    public void canUserReserveABookInTheLibrary(){
        User userObject = new User("Sample Name",'M',25,1232);  //User Details - Name,Gender,Age,Library Number
        Library libraryobject = new Library();

        Book[] bookobjects = new Book[2];
        bookobjects[0] = new Book("1234567890123","SampleTitle","SampleAuthor","SamplePublisher",1,2012,5);
        bookobjects[1] = new Book("3210987654321","SamplTitle1","SamplAuthor1","SamplPublisher1",1,2011,3);
        libraryobject.addBook(bookobjects);

        assertNotNull(userObject);
        assertTrue(userObject.addTothisLibrary(libraryobject));
        assertTrue(userObject.reserveBookInLibrary("1234567890123"));  //Must Specify ISBN Number
    }
    /*
    @Test
    public void canUserReserveABookInTheLibrary(){
        User userObject = new User("Sample Name",'M',25,1232);  //User Details - Name,Gender,Age,Library Number
        Library libraryobject = new Library();

        Book[] bookobjects = new Book[2];
        bookobjects[0] = new Book("1234567890123","SampleTitle","SampleAuthor","SamplePublisher",1,2012,5);
        bookobjects[1] = new Book("3210987654321","SamplTitle1","SamplAuthor1","SamplPublisher1",1,2011,3);
        libraryobject.addBook(bookobjects);

        assertNotNull(userObject);
        assertTrue(userObject.addTothisLibrary(libraryobject));
        assertTrue(userObject.reserveBookInLibrary("1234567890123"));  //Must Specify ISBN Number
    } */

    @Test
    public void testEqualityOfTwoUserObjects(){
        User userObject1 = new User("Sample Name",'M',25,1232234,"password1");  //User Details - Name,Gender,Age,Library Number,Password
        User userObject2 = new User(1232234,"password1");
        User userObject3 = new User(1232294,"password1");
        assertTrue(userObject1.equals(userObject2));
        assertFalse(userObject1.equals(userObject3));
    }

}
