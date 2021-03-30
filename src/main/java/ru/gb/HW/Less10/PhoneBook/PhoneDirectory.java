package ru.gb.HW.Less10.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    //Создадим приватную коллекцию Map для хранения телефонов и фамилий
    private  Map<Long, String> directory = new HashMap<>();

    //Создадим метод принимающий номер телефона и фамилию для добавления новых записей в коллекцию directory
    public void addNewEntry(Long phone, String surname){
        //Добавляем в колекцию телефон и фамилию
        directory.put(phone, surname);
    }

    //Создадим метод для поиска номеров по фамилии
    public void get(String surname){
        //Создадим коллекцию для хранения номеров с одинаковой фамилией
        List<Long> phoneList = new ArrayList<>();
        //Пройдемся по всем ключам коллекции directory
        for (Long aLong : directory.keySet()) {
            //Если у ключа значение Value еквивалентно переданной фамилии
            if (surname.equals(directory.get(aLong))){
                //Добавляем ключ в коллекцию phoneList
                phoneList.add(aLong);
            }
        }
        System.out.printf("По фамилии %s нашлись номера: %s", surname,  phoneList);
    }
}
