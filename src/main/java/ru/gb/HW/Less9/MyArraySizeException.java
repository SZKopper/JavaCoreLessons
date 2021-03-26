package ru.gb.HW.Less9;

public class MyArraySizeException extends Exception{
    //Выводи текст исключения спомощю метода унаследованного от родительского класса
    public MyArraySizeException(String errorMessage) {
        super(errorMessage);
    }
}