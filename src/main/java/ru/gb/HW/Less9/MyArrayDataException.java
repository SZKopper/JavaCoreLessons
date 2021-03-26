package ru.gb.HW.Less9;
// NumberFormatException extends Exception
public class MyArrayDataException extends Exception{
    //Выводи текст исключения спомощю метода унаследованного от родительского класса
    public MyArrayDataException (String errorMessage) {
        super(errorMessage);
    }
}
