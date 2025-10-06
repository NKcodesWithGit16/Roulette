package betAndbetStream;

import betAndbetStream.Enums.EvenOdd;
import betAndbetStream.Interface.Bet;
import game.Board;

public class betOnEvenOdd implements Bet {
    private EvenOdd n;
    private int placedAmount;
    public betOnEvenOdd(EvenOdd n,int placedAmount){
        this.n=n;
        this.placedAmount=placedAmount;
    }

    public int getPlacedAmount() {
        return placedAmount;
    }

    @Override
    public boolean isWinning(Board brd) {
        int c=brd.getRandomNum();
        if(c==0){
            return false;
        }
        return (c%2==0&&n==EvenOdd.even)||(c%2==1&&n==EvenOdd.odd);
    }

    @Override
    public int Profit(Board brd) {
        if(isWinning(brd)){
            return placedAmount;
        }
        return -placedAmount;
    }
}
