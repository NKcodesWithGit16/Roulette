package betAndbetStream;

import betAndbetStream.Enums.Half;
import betAndbetStream.Interface.Bet;
import game.Board;

public class betOnHalf implements Bet {
    private Half half;
    private int placedAmount;
    public betOnHalf(Half half,int placedAmount){
        this.half=half;
        this.placedAmount=placedAmount;
    }

    @Override
    public int getPlaced() {
        return placedAmount;
    }

    @Override
    public boolean isWinning(Board brd) {
        int c= brd.getRandomNum();
        return (c>0&&c<19&&half==Half.first)||(c>18&&c<37&&half==Half.second);
    }

    @Override
    public int Profit(Board brd) {
        if (isWinning(brd)){
            return placedAmount;
        }
        return -placedAmount;
    }
}
