package ru.gb.HW.Less10.PhoneBook;

public class Main {
    public static void main(String[] args) {
        //Создаем объект для добавления новых записей в тел-ю книгу
        PhoneDirectory newEntry = new PhoneDirectory();
        //Добавляем номера и фамилии
        newEntry.addNewEntry(89999999999L, "Tomson");
        newEntry.addNewEntry(89999999779L, "Tomson");
        newEntry.addNewEntry(89999999789L, "Tomson");
        newEntry.addNewEntry(89999999729L, "Timber");
        newEntry.addNewEntry(89999999732L, "Timber");
        newEntry.addNewEntry(89999999754L, "Tasman");
        //Выполним поис по фамилии
        newEntry.get("Tomsons");
    }
}
