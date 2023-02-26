public class methodChallenge {
    public static void main(String[] args) {

        displayHighScorePosition(1, "vishwaa");
        System.out.println(calculateHighScorePosition(1500));
        System.out.println(calculateHighScorePosition(1000));
        System.out.println(calculateHighScorePosition(500));
        System.out.println(calculateHighScorePosition(100));
        System.out.println(calculateHighScorePosition(25));
    }
    public static void displayHighScorePosition(int position, String name ){
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }

    public static int calculateHighScorePosition(int score){
        int Score;
        Score = score;
        if(Score >= 1000){
            return 1;
        } else if(Score >= 500){
            return 2;
        } else if (Score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
