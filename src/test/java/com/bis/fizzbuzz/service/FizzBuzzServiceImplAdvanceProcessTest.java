package com.bis.fizzbuzz.service;

import org.junit.jupiter.api.Test;

import static com.bis.fizzbuzz.domain.Constant.*;
import static com.bis.fizzbuzz.domain.Constant.BUZZNUMBER;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class FizzBuzzServiceImplAdvanceProcessTest {
    private FizzBuzzService fizzBuzzService = new FizzBuzzServiceImpl();

    @Test
    public void fizzTest() {
        assertEquals(FIZZTEXT, fizzBuzzService.advanceProcess(FIZZNUMBER));
    }

    @Test
    public void errorTest() {
        assertNotSame(fizzBuzzService.advanceProcess(8), FIZZTEXT);
    }

    @Test
    public void buzzTest() {
        assertEquals(BUZZTEXT, fizzBuzzService.advanceProcess(BUZZNUMBER));
    }


    @Test
    public void fizzBuzzTest() {
        assertEquals(FIZZTEXT + BUZZTEXT, fizzBuzzService.advanceProcess(FIZZNUMBER * BUZZNUMBER));
    }

    @Test
    public void fizzBuzzNumberTest() {
        // Test any odd number
        assertEquals("17", fizzBuzzService.advanceProcess(17));

        //Test 0 number
        assertEquals("0", fizzBuzzService.advanceProcess((0)));

        //Test negative number
        assertEquals("-1", fizzBuzzService.advanceProcess((-1)));

        //Test Min Integer value
        assertEquals(String.valueOf(Integer.MIN_VALUE), fizzBuzzService.advanceProcess((Integer.MIN_VALUE)));

        //Test Max Integer value
        assertEquals(FIZZTEXT, fizzBuzzService.advanceProcess((Integer.MAX_VALUE)));
    }

    @Test
    public void fizzBuzzNullValueTest() {
        //Test for null value
        assertEquals("", fizzBuzzService.advanceProcess(null));
    }

    @Test
    public void fizzBuzzContainsValue3Test() {
        //Test for value which contains '3'
        assertEquals(FIZZTEXT, fizzBuzzService.advanceProcess(13));
        assertEquals(FIZZTEXT, fizzBuzzService.advanceProcess(23));
        assertEquals(FIZZTEXT, fizzBuzzService.advanceProcess(33));
        assertEquals(FIZZTEXT, fizzBuzzService.advanceProcess(43));
        assertEquals(FIZZTEXT+BUZZTEXT, fizzBuzzService.advanceProcess(53));
    }

    @Test
    public void fizzBuzzContainsValue5Test() {
        //Test for value which contains '5'
        assertEquals(FIZZTEXT+BUZZTEXT, fizzBuzzService.advanceProcess(15));
        assertEquals(BUZZTEXT, fizzBuzzService.advanceProcess(25));
        assertEquals(FIZZTEXT+BUZZTEXT, fizzBuzzService.advanceProcess(35));
        assertEquals(FIZZTEXT+BUZZTEXT, fizzBuzzService.advanceProcess(45));
        assertEquals(BUZZTEXT, fizzBuzzService.advanceProcess(55));
    }

}
