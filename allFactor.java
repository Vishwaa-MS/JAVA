public class allFactor {
    public static void main(String[] args) {
        FactorPrinter(10);
    }
    public static void FactorPrinter(int number){
        if(number< 1){
            System.out.println("Invalid Value");
        } else{
        for (int i=1; i<1000; i++) {
            if (number % i == 0) {
                System.out.println(i);
                }
            }
        }
    }
}
