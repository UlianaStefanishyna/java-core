package com.core.patterns.structural.proxy.impl;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProxyServiceInterfaceImplTest {

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;

    @BeforeAll
    static void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    static void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void proxyOperationTest() {
        ProxyServiceInterfaceImpl proxy = new ProxyServiceInterfaceImpl();
        proxy.operation();

        String[] actualOutput = outContent.toString().split("\\n");

        assertNotNull(actualOutput);
        assertEquals(2, actualOutput.length);

        assertEquals("proxy method invoked first", actualOutput[0]);
        assertEquals("real method invoked after", actualOutput[1]);
    }
}