public class milesToKm {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(75.114));
        printConversion(75.114);
    }
    public static long toMilesPerHour (double kilometrersPerHour){
        if ( kilometrersPerHour < 0){
            return -1;
        }
        return  Math.round((kilometrersPerHour/1.609));
    }

    public static void printConversion ( double kilometersPerHour) {
        long miles = 0;
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
           miles = toMilesPerHour(kilometersPerHour);
           System.out.println(kilometersPerHour + "km/h=" + miles + "mi/h");
        }
    }
}
