package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SommeTest {
    @Test
    public void add() {
        MainActivity mainActivity=new MainActivity();
        int result = mainActivity.add(5,2);
        int expected = 7;
        assertEquals(expected, result);
    }
}
