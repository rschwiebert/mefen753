public class pdPlayer {
    public int cooperates = 0;
    public int defects = 0;
    public int score = 0;
    public char[] history = new char[200];
    public String strategyName = "Tit For Tat";
    
    public char strategy(pdPlayer opp) {
        //TFT
        if (Main.round == 0) {
            return 'C';
        }
        return opp.history[Main.round - 1];
    }
}