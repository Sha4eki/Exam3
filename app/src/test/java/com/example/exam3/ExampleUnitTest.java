package com.example.exam3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    public static boolean isPal(int n) {
        String s = Integer.toString(n);
        //s = "12321";
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(false, isPal(123));
        assertEquals(true, isPal(12321));
        assertEquals(true, isPal(1));
        assertEquals(false, isPal(123215));
    }
}