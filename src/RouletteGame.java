import game.Board;
import java.util.Scanner;
import parsers.parseInput;
public class RouletteGame {
    private Board board;
    public void visualizeAtFirst(){
        System.out.println("");
        System.out.println("This is the game called Roullete,wish you the best gambling ever!!!");
        System.out.println("Enter touples for your bet.ex:(red,5),(17,4),(even,10)--->(bet on,price)");
        Scanner scn=new Scanner(System.in);
        String st=scn.next();
        parseInput pi=new parseInput(st);
        

    }
}
