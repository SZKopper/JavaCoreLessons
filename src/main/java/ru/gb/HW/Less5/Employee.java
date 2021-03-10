package ru.gb.HW.Less5;

public class Employee {
    //Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    private String fio;
    private String position;
    private String email;
    private String number;
    private String salary;
    private int age;

    //Конструктор класса должен заполнять эти поля при создании объекта.
    public Employee(String fio,String position,String email,String number,String salary,int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void info() {
        System.out.println("ФИО " + fio + " должность " + position + " email " + email + " телефон " + number + " зарплата " + salary + " возраст " + age);

    }
}
