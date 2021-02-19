public class MoreLess {
    //Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void main(String[] args) {
        moreLess(-1);
    }
    public static void moreLess(int a){
        if (a >= 0)
            System.out.println("Числоа положительное");
        else
            System.out.println("Число отрицательное");
    }
}
