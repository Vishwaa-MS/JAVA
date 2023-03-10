public class SharedDigit {
    public static void main(String[] args) {
            System.out.println(hasSharedDigit(19, 29));
    }
    public static boolean hasSharedDigit(int number1, int number2) {
        int num1FirstDigit, num1LastDigit, num2FirstDigit, num2LastDigit;
        if ((number1 < 10 || number1 > 99) || (number2< 10 || number2 > 99)){
            return false;
        }
        num1LastDigit = number1 %10;
        num1FirstDigit = number1 / 10;
        num2LastDigit = number2 % 10;
        num2FirstDigit = number2 / 10;
        return (num1FirstDigit == num2FirstDigit) || (num1FirstDigit == num2LastDigit) || (num1LastDigit == num2FirstDigit) || (num1LastDigit == num2LastDigit);
    }
}
