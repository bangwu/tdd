package com.thoughtworks.nho;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void should_return_1_when_give_1() {
        assertEquals(1, fibonacci.generate(1));
    }

    @Test
    public void should_return_1_when_give_2() {
        assertEquals(1, fibonacci.generate(2));
    }

}