public class challengeTwo {
    public static void main(String[] args) {

        calculateMethod(1000, 8);
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("YOUR FINAL SCORE WAS "+ finalScore);
        }
    }

    public static void calculateMethod(int score1, int level){
        boolean gameOver = true;
        int score = score1;
        int levelCompleted = level;
        int bonus = 200;

        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("YOUR FINAL SCORE WAS "+ finalScore);
    }
}
}

