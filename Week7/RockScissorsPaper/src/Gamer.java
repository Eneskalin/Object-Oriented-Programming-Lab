import java.util.Scanner;
public class Gamer {
    static int numofDraw;
    static int getNumofTrials;
    int numofWin;
    String name;
    HandSign sign;

    Gamer(String name){
        this.name=name;
    }

    void move() {
        char ch;
        boolean isInvalid;
        Scanner input = new Scanner(System.in);
        do {
            isInvalid = false; // Reset each loop iteration
            System.out.println(name + ", press r (rock), s (scissor), p (paper), or q (quit): ");
            ch = input.next().toLowerCase().charAt(0);
            switch (ch) {
                case 'r':
                    this.sign = HandSign.ROCK;
                    break;
                case 's':
                    this.sign = HandSign.SCISSOR;
                    break;
                case 'p':
                    this.sign = HandSign.PAPER;
                    break;
                case 'q':
                    Arena.isGameOver = true;
                    break;
                default:
                    System.out.println("Invalid Value!!!");
                    isInvalid = true;
                    break;
            }
        } while (isInvalid);
    }

}


