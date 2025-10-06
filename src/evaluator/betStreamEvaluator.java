package evaluator;

import betAndbetStream.Interface.Bet;
import game.Board;

import java.util.ArrayList;

public class betStreamEvaluator {
    private ArrayList<Bet> stream;
    private Board brd;
    public betStreamEvaluator(ArrayList<Bet> stream,Board brd){
        this.stream=stream;
        this.brd=brd;
    }
    public int totalPlaced(){
        int totalPlaced=0;
        for(int i=0;i<stream.size();i++){
            totalPlaced+=stream.get(i).getPlaced();
        }
        return totalPlaced;
    }
    public int totalProfit(){
        int totalProfit=0;
        for (int i = 0; i<stream.size(); i++) {
            totalProfit+=stream.get(i).Profit(brd);
        }
        return totalProfit;
    }
    public int totalWin(){
        return totalProfit()+totalPlaced();
    }


}
