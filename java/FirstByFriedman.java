public class FirstByFriedman extends pdPlayer {
    public FirstByFriedman() {
        strategyName = "First By Friedman";
    }
    
    public char strategy(pdPlayer opp) {
        if (opp.defects > 0) {
            return 'D';
        }
        return 'C';
    }
}