public class Arena {
    Gamer g1;
    Gamer g2;
    static  boolean isGameOver=false;

    void addGamer(Gamer g1,Gamer g2){
        this.g1=g1;
        this.g2=g2;
    }

    void startGamers(Gamer g1, Gamer g2){

        while (!isGameOver ){
            g1.move();
            g2.move();
            StatMaker.proccessMoves(g1,g2);
            StatMaker.displayScores(g1,g2);


        }
    }

    void startGame(){

    }
}
