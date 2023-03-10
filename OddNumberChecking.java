public class OddNumberChecking {
    public static void main(String[] args) {
        System.out.println(sumOdd(13,13));
    }
    public static boolean isOdd (int number) {
        return number >= 0 && number % 2 != 0;
    }
    public static int sumOdd (int startNum , int endNum){
        int sum = 0;
        if (startNum < 0 || endNum < startNum){
            return -1;
        }
        for (int i = startNum ; i <= endNum ; i++) {
            if (isOdd(i)){
                sum += i;
            }

        } return sum;
    }
}
