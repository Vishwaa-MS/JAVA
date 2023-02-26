public class MinutesChallenge {
    public static void main(String[] args) {
        System.out.println(secondsMinutes(3945));
        System.out.println(secondsMinutes(65, 145));
    }

    public static String secondsMinutes(int secs) {
        if (secs >= 0){
            int min = secs / 60;
            return secondsMinutes(secs/60, secs%60);
        }
        return "Invalid Seconds";
    }

    public static String secondsMinutes(int min, int sec) {
        if (min >= 0 && (sec >= 0 || sec <=59) ) {
            int hour = min / 60;
            int secs = sec % 60;
            int mins = ((min) % 60);
            return hour + "h " + mins + "m " + secs + "s";
        } else if (min >=0 && sec >=0 ) {
            int hour = min / 60;
            int secs = sec % 60;
            int mins = ((min) % 60) + (sec/60);
            return hour + "h " + mins + "m " + secs + "s";
        }
        return "Invalid Input";
    }
}
