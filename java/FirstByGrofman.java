public class FirstByGrofman extends pdPlayer {
    public FirstByGrofman() {
        strategyName = "First By Grofman";
    }
    public char strategy(pdPlayer opp) {
        if (Main.round == 0) {return 'C';}
        if (history[Main.round - 1] == opp.history[Main.round - 1]) {return 'C';}
        if (Math.random() < 2 / 7) {return 'C';} else {return 'D';}
    }
}