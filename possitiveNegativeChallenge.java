public class possitiveNegativeChallenge {
    public static void main(String[] args) {
        checkNum(-20);
        }
    public static void checkNumber (int number) {

        if(number > 0){
            System.out.println("postive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
    // other way
    public static void checkNum (int number) {
        System.out.println((number > 0) ? "positive" : ((number < 0) ? "negative" : "zero"));
    }
}
