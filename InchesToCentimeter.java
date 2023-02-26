public class InchesToCentimeter {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(7));
        System.out.println(convertToCentimeters(5,8));
    }
    public static double convertToCentimeters ( int HeightInInches) {
        return  HeightInInches * 2.54;    }
    public static double convertToCentimeters (int HeightInFoot , int HeightInInches) {
//        return convertToCentimeters((HeightInFoot * 12) + HeightInInches);
        int feetToInches = HeightInFoot *12;
        int totalInches = feetToInches +HeightInInches;
        double centimeters = convertToCentimeters( totalInches );
        return centimeters;

    }
}

