public class FirstBySteinAndRapoport extends pdPlayer{
    public boolean oppIsRandom = false;
    
    public FirstBySteinAndRapoport() {
        strategyName = "First By Stein and Rapoport";
    }
    
    public char strategy(pdPlayer opp) {
        if (Main.round < 4) {
            return 'C';
        }
        if (Main.round > 197) {
            return 'D';
        }
        if (Main.round % 15 == 0) {
            double minBound = 0.325 * Main.round;
            double maxBound = 0.625 * Main.round;
            oppIsRandom = (minBound <= opp.cooperates && opp.cooperates <= maxBound);
        }
        if (oppIsRandom) {
            return 'D';
        }
        return opp.history[Main.round - 1];
    }
}