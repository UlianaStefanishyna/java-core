package com.core.algorithms.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialAlgorithmTest {

    private FactorialAlgorithm factorial = new FactorialAlgorithm();

    @Test
    void test_MyFactorial() {
        int actualResult = this.factorial.myFactorial(4);
        assertEquals(24, actualResult);
    }

    @Test
    void test_FactorialOfNegativeValue() {
        assertThrows(RuntimeException.class, () -> this.factorial.myFactorial(-1));
    }

    @Test
    void test_FactorialOfZeroAndOne() {
        int zeroFactorial = this.factorial.myFactorial(0);
        int oneFactorial = this.factorial.myFactorial(1);

        assertEquals(zeroFactorial, oneFactorial);
        assertEquals(1, zeroFactorial);
        assertEquals(1, oneFactorial);
    }
}