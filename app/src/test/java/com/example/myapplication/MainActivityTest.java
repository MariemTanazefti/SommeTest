package com.example.myapplication;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {



    @Test
    public void add() {
        MainActivity mainActivity=new MainActivity();
        int result = mainActivity.add(2,2);
        int expected = 4;
        assertEquals(expected, result);
    }
}