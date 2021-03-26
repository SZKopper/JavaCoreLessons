package ru.gb.HW.Less9;

public class App {
    public static void main(String[] args) {
        //Создаем корректный двумерныймассив
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        //Создаем не корректный двумерныймассив
        String[][] badArr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] badArr2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "t", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}

        };
        //Создаем объект класса App
        App app = new App();
        try {
            //Вызываем метод arrEnter, передаем корректный массив и выводим сумму элементов нв экран
            System.out.println(app.arrEnter(arr));
            //Вызываем метод arrEnter и передаем некорректный массив
            System.out.println(app.arrEnter(badArr));
            //Вызываем метод arrEnter и передаем некорректные данные
            System.out.println(app.arrEnter(badArr2));
            //Вызваем исключения
        } catch (MyArraySizeException | MyArrayDataException e){
            //Выводим стэктрейс
            e.printStackTrace();
        }
    }

    public int arrEnter(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        //Переменая для хранения суммы элементов массива
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //Проверяем если массив < четырех строк
            if (arr.length != 4){
                //Вызваем (бросаем) исключение и пеедаем текст ошибки
                throw new MyArraySizeException("Передано неверное колличество строк");
            }
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    //Если ловим NumberFormatException бросаем исключение MyArrayDataException
                    throw new MyArrayDataException("В ячейке " + i + ":" + j + " лежат неверные данные");
                }
            }
        }
       return sum;
    }
}


