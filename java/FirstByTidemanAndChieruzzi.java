public class FirstByTidemanAndChieruzzi extends pdPlayer {
    int k = 0;  //k here is the extra punishment here
    int retaliationRemaining = 0;
    boolean opponentOnStreak = false;
    
    public void decreaseRetaliationCounter() {
        retaliationRemaining--;
        if (retaliationRemaining == 0) {
            k++;
        }
    }
    
    public FirstByTidemanAndChieruzzi() {
        strategyName = "First By Tideman and Chieruzzi";
    }
    
    public char strategy(pdPlayer opp) {
        if (Main.round == 0) {
            return 'C';
        }
        if (Main.round > 197) {
            return 'D';
        }
        if (retaliationRemaining > 0) {
            decreaseRetaliationCounter();
            return 'D';
        }
        if (opp.history[Main.round - 1] == 'D') {
            opponentOnStreak = true;
        } else if (opponentOnStreak) {
            opponentOnStreak = false;
            retaliationRemaining = k;
        }
        if (retaliationRemaining > 0) {
            decreaseRetaliationCounter();
            return 'D';
        }
        if (opponentOnStreak) {
            return 'D';
        }
        return 'C';
    }
}
