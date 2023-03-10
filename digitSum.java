public class digitSum {
    public static void main(String[] args) {
        System.out.println(sumDigit(1));
    }

    public static int sumDigit(int number) {
//        if (number < 0){
//            return -1;
//        }
//        int sum = 0;
//        for (sum = 0; number != 0; number /= 10) {
//            sum += number % 10;
//
//        } return sum;

        if (number<0){
            return -1;
        }
        int sum = 0;
        while (number > 9) {
            sum+= (number%10);
            number/=10;
        }
        sum+=number;
        return sum;
    }
}

