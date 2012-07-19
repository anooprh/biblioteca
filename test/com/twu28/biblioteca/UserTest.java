package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.*;

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
}
