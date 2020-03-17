package com.bis.fizzbuzz.service;

import org.junit.jupiter.api.Test;

import static com.bis.fizzbuzz.domain.Constant.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class FizzBuzzServiceImplTest {

    private FizzBuzzService fizzBuzzService = new FizzBuzzServiceImpl();

    @Test
    public void fizzTest() {
        assertEquals(FIZZTEXT, fizzBuzzService.process(FIZZNUMBER));
    }

    @Test
    public void errorTest() {
        assertNotSame(fizzBuzzService.process(8), FIZZTEXT);
    }

    @Test
    public void buzzTest() {
        assertEquals(BUZZTEXT, fizzBuzzService.process(BUZZNUMBER));
    }


    @Test
    public void fizzBuzzTest() {
        assertEquals(FIZZTEXT + BUZZTEXT, fizzBuzzService.process(FIZZNUMBER * BUZZNUMBER));
    }

    @Test
    public void fizzBuzzNumberTest() {
        // Test any odd number
        assertEquals("17", fizzBuzzService.process(17));

        //Test 0 number
        assertEquals("0", fizzBuzzService.process((0)));

        //Test negative number
        assertEquals("-1", fizzBuzzService.process((-1)));

        //Test Min Integer value
        assertEquals(String.valueOf(Integer.MIN_VALUE), fizzBuzzService.process((Integer.MIN_VALUE)));

        //Test Max Integer value
        assertEquals(String.valueOf(Integer.MAX_VALUE), fizzBuzzService.process((Integer.MAX_VALUE)));
    }

    @Test
    public void fizzBuzzNullValueTest() {
        assertEquals("", fizzBuzzService.process(null));
    }
}
