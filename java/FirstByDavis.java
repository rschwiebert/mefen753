public class FirstByDavis extends pdPlayer {
    public FirstByDavis() {
        strategyName = "First By Davis";
    }
    
    public char strategy(pdPlayer opp) {
        if (Main.round < 10 || opp.defects == 0) {
            return 'C';
        }
        return 'D';
    }
}