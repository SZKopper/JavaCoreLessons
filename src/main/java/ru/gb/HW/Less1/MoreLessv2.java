public class MoreLessv2 {
    //Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное,
    // и вернуть false если положительное.
    public static void main(String[] args) {
        moreLess(-123);
    }

    public static boolean moreLess(int a){
        boolean result;
        if (a >= 0){
            result = false;
        } else {
            result = true;
        }
        return result;
    }
}
