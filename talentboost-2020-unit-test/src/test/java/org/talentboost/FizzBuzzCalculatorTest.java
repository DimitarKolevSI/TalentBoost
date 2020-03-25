package org.talentboost;

import java.util.Random;

import static org.junit.Assert.*;

public class FizzBuzzCalculatorTest {

    FizzBuzzCalculator fb;

    @org.junit.Before
    public void setUp(){
       fb = new FizzBuzzCalculator();
    }

    @org.junit.Test
    public void whenValidNumbers(){
        //Given
        int firstNumber = 10;
        int secondNumber = 15;
        int thirdNumber = 6;
        final int THREE = 3;

        //When
        String should_be_buzz = fb.calculate(firstNumber);
        String should_be_fuzzbuzz = fb.calculate(secondNumber);
        String should_be_fuzz = fb.calculate(thirdNumber);
        String test_for_three = fb.calculate(THREE);

        //Then
        assertEquals("FizzBuzz",should_be_fuzzbuzz);
        assertEquals("Buzz",should_be_buzz);
        assertEquals("Fizz",should_be_fuzz);
        assertEquals("Fizz",test_for_three);
    }

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void expectedErrors() {
        //Given
        int fourthNumber = 4;
        final int ZERO = 0;
        final int RANDOM = 256;

        //When
        String should_be_number = fb.calculate(fourthNumber);
        String test_for_zero = fb.calculate(ZERO);
        String test_for_random = fb.calculate(RANDOM);

        //Then
        assertEquals("4",should_be_number);
        assertEquals("FizzBuzz",test_for_zero);
        assertEquals("256",test_for_random);
    }
}