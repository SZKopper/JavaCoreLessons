import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YearDefinition {
    //*Написать метод, который определяет, является ли год високосным,
    // и выводит сообщение в консоль. Каждый 4-й год является високосным,
    // кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " обычный");
        }

    }
}


