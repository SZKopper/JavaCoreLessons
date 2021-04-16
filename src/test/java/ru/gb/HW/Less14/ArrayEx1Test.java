package ru.gb.HW.Less14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayEx1Test {
    private static ArrayEx1 array;

    @BeforeEach
    void init() {
        array = new ArrayEx1();
    }

    @Test
    void findArrSizeTest1(){
        assertArrayEquals(new int[]{5,6}, array.change(new int[]{1,4,5,6}));
    }
    @Test
    void findArrSizeTest2(){
        assertArrayEquals(new int[]{}, array.change(new int[]{1,3,5,4}));
    }
    @Test
    void findArrSizeTest3(){
        assertArrayEquals(new int[]{5,45,6,3,7,50}, array.change(new int[]{4,5,45,6,3,7,50}));
    }
    @Test
    void findArrSizeTest4(){
        assertArrayEquals(new int[]{3,7,50}, array.change(new int[]{4,5,45,6,4,3,7,50}));
    }
    @Test
    public void testRuntimeException() throws RuntimeException{
        try {
            array.change(new int[] {1,2,3});
        } catch (RuntimeException e){
            e.getMessage();
        }
    }
}