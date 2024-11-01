public class StatMaker {
    static void proccessMoves(Gamer g1,Gamer g2){
        if (g1.sign == null || g2.sign == null ){
            return;
        }
        else if (g1.sign   == g2.sign){
            Gamer.numofDraw++;
        } else if (g1.sign == HandSign.PAPER && g2.sign==HandSign.ROCK ) {
            g1.numofWin++;
        } else if (g1.sign == HandSign.ROCK && g2.sign == HandSign.SCISSOR) {
            g1.numofWin++;
        } else if (g1.sign == HandSign.SCISSOR && g2.sign == HandSign.PAPER) {
            g1.numofWin++;
        }
        else {
            g2.numofWin++;
        }
        Gamer.getNumofTrials++;
    }

    static void displayScores(Gamer g1, Gamer g2) {
        System.out.println(g1.name + ": " + g1.numofWin + " VS " + g2.name + ": " + g2.numofWin);
        System.out.println("Draws: " + Gamer.numofDraw);
        System.out.println("Trials: " + Gamer.getNumofTrials);
    }

}
