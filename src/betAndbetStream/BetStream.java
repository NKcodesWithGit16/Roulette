package betAndbetStream;

import betAndbetStream.Interface.Bet;

import java.util.ArrayList;

public class BetStream {
    private ArrayList<Bet> str;
    public BetStream(ArrayList<Bet> str){
        this.str=str;
    }
    public ArrayList<Bet> getStr() {
        return str;
    }
}
