package betAndbetStream;

import betAndbetStream.Interface.Bet;
import game.Board;

public class betOnNumber implements Bet {
    private int betsOn;
    private int placedAmount;
    public betOnNumber(int betsOn,int placedAmount){
        this.betsOn=betsOn;
        this.placedAmount=placedAmount;
    }

    public int getBetsOn() {
        return betsOn;
    }

    public int getPlaced() {
        return placedAmount;
    }

    @Override
    public int Profit(Board brd) {
        if(isWinning(brd)){
            return 35*placedAmount;
        }
        return -placedAmount;
    }

    @Override
    public boolean isWinning(Board brd) {
        return brd.getRandomNum()==getBetsOn();
    }
}
