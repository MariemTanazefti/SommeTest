package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SommeTest {
    @Test
    public void add() {
        Somme somme=new Somme();
        int result = somme.add(5,2);
        int expected = 7;
        assertEquals(expected, result);
    }
}
