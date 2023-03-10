public class PrimeNumberChecking {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10 ; count < 3 && i<=50 ; i++){
            if (isPrime(i)){
                System.out.println(i+ " is a prime number");
                count+=1;
            }
        }
    }
    public static boolean isPrime( int number) {
        if (number <= 2){
            return (number==2);
        }
        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0 ){
                return false;
            }
        } return true;
    }
}
