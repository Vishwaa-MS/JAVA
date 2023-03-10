public class FirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(121));
    }
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number %10;
        while (number >= 10){
            number/=10;
        }return (number + lastDigit);
    }
}
