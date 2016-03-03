package com.ashitaklax;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Created by Levi balling on 3/2/2016.
 */
public class JokesTest {

    @org.junit.Test
    public void testGetJoke() throws Exception {
        Jokes joker = new Jokes();
        //this test is just to make sure that we won't go past the limits of the array
        for (int i = 0; i < 1000; i++) {
            String jokeStr = joker.getJoke();
            assertNotNull(jokeStr);
            assertFalse(jokeStr.isEmpty());
        }

    }
}