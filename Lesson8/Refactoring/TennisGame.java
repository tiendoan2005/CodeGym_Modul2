public class TennisGame implements Number {

    public static String getScore(String playerOneName, String playerTwoName, int score1, int score2) {
        if (score1 == score2) {
            return getEqualScore(score1);
        } else if (score1 >= NUMBER_FOUR || score2 >= NUMBER_FOUR) {
            return getAdvantageOrWin(score1, score2);
        } else {
            return getRegularScore(score1, score2);
        }
    }


    private static String getEqualScore(int score) {
        switch (score) {
            case NUMBER_ZERO:
                return "Love-All";
            case NUMBER_ONE:
                return "Fifteen-All";
            case NUMBER_TWO:
                return "Thirty-All";
            case NUMBER_THREE:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String getAdvantageOrWin(int score1, int score2) {
        int difference = score1 - score2;
        if (difference == 1) return "Advantage player1";
        if (difference == -1) return "Advantage player2";
        if (difference >= 2) return "Win for player1";
        return "Win for player2";
    }

    private static String getRegularScore(int score1, int score2) {
        return getScoreDescription(score1) + "-" + getScoreDescription(score2);
    }

    private static String getScoreDescription(int score) {
        switch (score) {
            case NUMBER_ZERO:
                return "Love";
            case NUMBER_ONE:
                return "Fifteen";
            case NUMBER_TWO:
                return "Thirty";
            case NUMBER_THREE:
                return "Forty";
            default:
                return "";
        }
    }
}