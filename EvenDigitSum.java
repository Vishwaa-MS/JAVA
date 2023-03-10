public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2262));
    }
    public static int getEvenDigitSum (int number) {
        int EvenSum = 0;
        if (number < 0) {
            return -1;
        }
        while (number > 0){
            int evenDigit = number % 10;
            if (evenDigit % 2 == 0) {
                EvenSum+=evenDigit;
            }
            number/=10;
        } return EvenSum;
    }
}
