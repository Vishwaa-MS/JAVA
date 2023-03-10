public class NumberToWord {
    public static void main(String[] args) {
        numberToWords(959471255);

    }
    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Number");
        }
        int noOfDigit = getDigitCount(number);
        int reversedNumber = reverse(number);
        for(int i = noOfDigit; i>0; i -= 1){
            int eachDigit = reversedNumber%10;

            switch (eachDigit) {
                case 0 :
                    System.out.println("Zero");
                    break;
                case 1 :
                    System.out.println("One");
                    break;
                case 2 :
                    System.out.println("Two");
                    break;
                case 3 :
                    System.out.println("Three");
                    break;
                case 4 :
                    System.out.println("Four");
                    break;
                case 5 :
                    System.out.println("Five");
                    break;
                case 6 :
                    System.out.println("Six");
                    break;
                case 7 :
                    System.out.println("Seven");
                    break;
                case 8 :
                    System.out.println("Eight");
                    break;
                case 9 :
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Other");

            } reversedNumber/=10;
        }

    }
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int count = 0;
        do {
            count+=1;
            number/=10;
        } while(number>0);
        return count;
    }
    public static int reverse(int number){
        if (number<0){
            number*=-1;
            int reverseNum = 0;
            while (number>0){
                reverseNum = (reverseNum*10) +number%10;
                number/=10;
            } return reverseNum*=-1;
        }
        int reverseNum = 0;
         while (number>0){
             reverseNum = (reverseNum*10) +number%10;
             number/=10;
         } return reverseNum;
    }
}
