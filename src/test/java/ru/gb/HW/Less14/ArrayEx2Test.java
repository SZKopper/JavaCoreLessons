package ru.gb.HW.Less14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayEx2Test {
    private static ArrayEx2 array;

    @BeforeEach
    void init() {
        array = new ArrayEx2();
    }

    @Test
    void checkTest1() {
        assertTrue(array.check(new int[]{1, 1, 1, 4, 4, 1, 4}));
    }
    @Test
    void checkTest2() {
        assertFalse(array.check(new int[]{1, 1, 1, 1, 1, 1}));
    }
    @Test
    void checkTest3() {
        assertFalse(array.check(new int[]{1, 4, 4, 1, 1, 4, 3}));
    }
    @Test
    void checkTest4() {
        assertFalse(array.check(new int[]{4, 4, 4, 4}));
    }


}