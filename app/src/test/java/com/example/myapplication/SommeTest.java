package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SommeTest{
    @Test
    public void addition(){
        Somme somme=new Somme();
        int result = somme.add(4,2);
        int expected = 6;
        assertEquals(expected, result);
    }
}
