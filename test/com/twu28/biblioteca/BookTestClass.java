package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 7/17/12
 * Time: 7:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookTestClass {

    @Test
    public void NewBookMustBeAvailable(){
        Book bookobject = new Book();
        assertTrue(bookobject.IsAvailable());
    }

    @Test
    public void NewBookMustBeReserved(){
        Book bookobject = new Book();
        assertTrue(bookobject.ReserveBook());
    }

    @Test
    public void ReservedBookMustNotBeAvailable(){
        Book bookobject = new Book();
        bookobject.ReserveBook();

        assertFalse(bookobject.IsAvailable());
    }


}
