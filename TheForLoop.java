public class TheForLoop {
    public static void main(String[] args) {
        for (double rate = 7.5; rate <=10; rate+=0.25){
            double interestAmount = calculateInterest(100.0, rate);
            System.out.println("100 at " + rate + "% interest = " + interestAmount);
        }
    }
    public static double calculateInterest (double amt, double interest) {
        return (amt * (interest/100));
    }
}
