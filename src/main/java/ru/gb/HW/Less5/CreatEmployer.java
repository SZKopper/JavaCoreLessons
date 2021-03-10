package ru.gb.HW.Less5;

public class CreatEmployer {
    //Создать массив из 5 сотрудников
    public static void main(String[] args) {
        Employee[] employeeArr = new Employee[5];
        employeeArr [0] = new Employee("Иванов Иван Иванович", "Начальник", "test@test.ru","79999999999", "2000$", 50);
        employeeArr [1] = new Employee("Петров Кирил Владимирович", "Зам Начальника", "test1@test.ru","79999999998", "1500$", 54);
        employeeArr [2] = new Employee("Саратов Олег Кириллович", "Бригадир", "test2@test.ru","79999999997", "1000$", 20);
        employeeArr [3] = new Employee("Кузьмин Виктор Сргеевич", "Разнорабочий", "test3@test.ru","79999999996", "500$", 35);
        employeeArr [4] = new Employee("Волхов Даниил Олегович", "Разнорабочий", "test4@test.ru","79999999995", "700$", 51);

        // С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getAge() > 40){
                employeeArr[i].info();
            }
        }
    }
}
