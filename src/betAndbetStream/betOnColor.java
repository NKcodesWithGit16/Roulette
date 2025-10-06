package betAndbetStream;

import betAndbetStream.Enums.Color;
import betAndbetStream.Interface.Bet;
import game.Board;

public class betOnColor implements Bet {
    private Color clr;
    private int placedAmount;

    public betOnColor(Color clr,int placedAmount){
        this.clr=clr;
        this.placedAmount=placedAmount;
    }

    @Override
    public int getPlaced() {
        return placedAmount;
    }

    @Override
    public int Profit(Board brd){
        if(isWinning(brd)){
            if(clr==Color.Green){
                return 35*placedAmount;
            }
            return placedAmount;
        }
        return -placedAmount;
    }

    @Override
    public boolean isWinning(Board brd){
        return rouletteColors[brd.getRandomNum()]==clr;
    }
}
