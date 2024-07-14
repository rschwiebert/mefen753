public class FirstByShubik extends pdPlayer {
    public int k = 1;
    public int retaliationsRemaining = 0;
    
    public FirstByShubik() {
        strategyName = "First By Shubik";
    }
    
    public void decreaseRetaliationCounter() {
        retaliationsRemaining--;
        if (retaliationsRemaining == 0) {
            k++;
        }
    }
    
    public char strategy(pdPlayer opp) {
        if (retaliationsRemaining > 0) {
            decreaseRetaliationCounter();
            return 'D';
        }
        if (Main.round == 0 || opp.history[Main.round - 1] == 'C') {
            return 'C';
        } else {
            retaliationsRemaining = k;
            decreaseRetaliationCounter();
            return 'D';
        }
        
    }
}