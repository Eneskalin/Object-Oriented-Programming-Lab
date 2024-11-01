//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gamer g1 = new Gamer("Enes");
        Gamer g2 = new Gamer("Veli");
        Arena arena = new Arena();
        arena.addGamer(g1, g2);
        arena.startGame();
    }
}