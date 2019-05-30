package com.core.algorithms.factorial;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialAlgorithmTest {

    private FactorialAlgorithm factorial;

    @Before
    public void setUp() {
        this.factorial = new FactorialAlgorithm();
    }

    @Test
    public void test_MyFactorial() {
        int actualResult = this.factorial.myFactorial(4);
        assertEquals(24, actualResult);
    }

    @Test(expected = RuntimeException.class)
    public void test_FactorialOfNegativeValue() {
        this.factorial.myFactorial(-1);
    }

    @Test
    public void test_FactorialOfZeroAndOne() {
        int zeroFactorial = this.factorial.myFactorial(0);
        int oneFactorial = this.factorial.myFactorial(1);

        assertEquals(zeroFactorial, oneFactorial);
        assertEquals(1, zeroFactorial);
        assertEquals(1, oneFactorial);
    }
}