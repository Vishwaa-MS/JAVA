public class LeapYear {
    public static void main(String[] args) {
    System.out.println(isLeapYear(2024));
    }
    public static boolean isLeapYear (int year){
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0){
                if (year % 100 == 0){
                    return  (year % 400 == 0);
                } else return true;
            } else return false;
        } else return false;
    }
}





//public static boolean isLeapYear (int year){
//        if (year < 1 || year >9999){
//            return false;
//        } else{
//            if (year % 4 ==0){
//                if (year % 100 == 0){
//                    if (year % 400 == 0){
//                        return true;
//                    } return false;
//                }return false;
//            }return false;
//        }
//    }