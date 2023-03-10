public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(12, 22, 33));
    }
    public static boolean isValid (int number){
        return (number >=10 && number <=1000);
    }
    public static boolean hasSameLastDigit (int num1, int num2, int num3){
        if ((isValid(num1)) && (isValid(num2)) && (isValid(num3))) {
            int firstNumLastDigit = num1 % 10;
            int secondNumLastDigit = num2 % 10;
            int thirdNumLastDigit = num3 % 10;
            return ((firstNumLastDigit == secondNumLastDigit) || (firstNumLastDigit == thirdNumLastDigit) || (secondNumLastDigit == thirdNumLastDigit));
        } else {
            return false;
        }
    }
}
