public class BarkingDog {
    public static void main(String[] args){
        System.out.println(shouldWakeUp(true,8));
    }
    public static boolean shouldWakeUp (boolean barking,  int hourOfDay){
        if ( barking && (hourOfDay >0 && hourOfDay <23)){
            if (hourOfDay < 8 || hourOfDay > 22){
                return true;
            }
            return false;
        }
        return false;
    }
}
// public static boolean shouldWakeUp (boolean barking,  int hourOfDay){
//        if ( barking && (hourOfDay >0 && hourOfDay <23)){
//            return hourOfDay < 8 || hourOfDay > 22;
//        }
//        return false;
//    }
