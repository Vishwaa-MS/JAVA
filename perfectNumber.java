public class perfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(18));
    }
    public static boolean isPerfectNumber(int number) {
        if (number<0 || number==0){
            return false;
        }
        int sum = 0;
        for(int i=1; i<number; i++){
            if(number %i == 0){
                sum+=i;
            }
        }
        return number == sum;
    }
}
