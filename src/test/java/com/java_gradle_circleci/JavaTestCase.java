package com.java_gradle_circleci;

import junit.framework.TestCase;

import static org.junit.Assert.*;

public class JavaTestCase extends TestCase {
    private int value1, value2;

    // assigning the values
    protected void setUp(){
        value1 = 3;
        value2 = 3;
    }

    // test method to add two values
    public void testAdd(){
        int result = value1 + value2;
        assertEquals(6, result);
    }
    // test method to subtract two values
    public void testSubtract(){
        int result = value1 - value2;
        assertEquals(0, result);
    }

    public void testReadFile() {
        try {
            String result = Main.readFile("README.md");
            assertNotEquals(result, "");
        } catch (Exception e) {
            fail();
        }
    }

    public void testRandomNumber() {
        assertEquals(Main.getRandomNumber(), 4);
    }
}
