public class ChallengeOne {
    public static void main(String[] args) {
        double var1 = 20.00;
        double var2 = 80.00;
        double ansVar = (var1 + var2) * 100.00d;
        System.out.println("My Answer = "+ansVar);

        double remVar = ansVar % 40.00d;
        System.out.println("Reminder = "+remVar);

        boolean isZero = (remVar == 0);
        System.out.println(isZero);

        if(isZero){
            System.out.println("Got zero as reminder");
        }
        else {
            System.out.println("Got " + remVar + " as reminder");
        }
    }
}
