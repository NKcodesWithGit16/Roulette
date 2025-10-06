package parsers;

import betAndbetStream.Interface.Bet;
import betAndbetStream.BetStream;

import java.util.ArrayList;

public class parseInput {
    private String st;
    public parseInput(String st){
        this.st=st;
    }
    public BetStream parse(){
        StringBuilder str=new StringBuilder();
        ArrayList<Bet> lst=new ArrayList<>();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==','){
                lst.add(new parseBet(str.toString()).parse());
                str=new StringBuilder();
                continue;
            }
            str.append(st.charAt(i));
        }
        lst.add(new parseBet(str.toString()).parse());
        return new BetStream(lst);

    }

}
