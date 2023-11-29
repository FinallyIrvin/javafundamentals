package com.fundamentals.lessons;

import com.fundamentals.House;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/* Writing Unit Test */
public class Lesson19Test {



    Lesson19 lesson19;
    House mine;

    @BeforeEach
    void setup() {
        lesson19 = new Lesson19();
    }

    @Test
    void testCalculate() {
        double actualArea = 3.141592653589793;
        double expectedArea = lesson19.calculateArea(1d);
        assertEquals(expectedArea, actualArea, "Values should match.");
    }

    @Test
    void testCharArray() {
        char[] actual = "UnitTest".toCharArray();
        char[] expected = lesson19.myCharArrayExample();
        assertArrayEquals(expected, actual, "Arrays should be equal");
    }

    @Test
    void testIsGreaterTrue() {
        assertTrue(lesson19.isGreaterExample(7,3),
                "7 is greater than 3");
    }

    @Test
    void testIsGreaterFalse() {
        assertFalse(lesson19.isGreaterExample(3,7),
                "3 is less than 7");
    }


    @Test
    void testHouseForNull() {
        assertNull(lesson19.myHouseExample(mine),
                "House is null");
    }

    @Test
    void testHouseNotNull() {
        mine = new House();
        assertNotNull(lesson19.myHouseExample(mine),
                "House is not Null");
    }

}
