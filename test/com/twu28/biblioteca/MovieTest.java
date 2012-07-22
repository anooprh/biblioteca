package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 7/22/12
 * Time: 8:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieTest {

    @Test
    public void canCreateANewMovieObject(){
        Movie movieObject1 = new Movie();
        Movie movieObject2 = new Movie("MovieName1","DirectorName1",5);
        Movie movieObject3 = new Movie("MovieName1","DirectorName1");

        assertNotNull(movieObject1);
        assertNotNull(movieObject2);
        assertNotNull(movieObject3);

    }

    @Test
    public void canViewAMovieDetails(){
        Movie movieObject1 = new Movie();
        Movie movieObject2 = new Movie("MovieName1","DirectorName1",5);
        Movie movieObject3 = new Movie("MovieName1","DirectorName1");


        assertNotNull(movieObject1);
        assertNotNull(movieObject2);
        assertNotNull(movieObject3);
        assertTrue(movieObject2.viewMovieDetails());
        assertTrue(movieObject3.viewMovieDetails());

    }


}
