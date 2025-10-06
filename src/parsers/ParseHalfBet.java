package parsers;

import betAndbetStream.Enums.Half;
import betAndbetStream.Interface.Bet;
import betAndbetStream.betOnColor;
import betAndbetStream.betOnHalf;

import java.util.HashMap;
import java.util.Map;

import static betAndbetStream.Enums.Half.first;
import static betAndbetStream.Enums.Half.second;

public class ParseHalfBet implements parseBet{
    private String betString;
    public ParseHalfBet(String betString){
        this.betString=betString;
    }

    @Override
    public boolean isValidFormat() {
        return betString.matches("^\\((first|second),\\s*[1-9]\\d*\\)$");
    }

    @Override
    public betOnHalf parse() {
        if(isValidFormat()){
            Map<String,Half> mp=new HashMap<>(){{
                put("first",first);
                put("second",second);
            }};
            StringBuilder hlf=new StringBuilder();
            StringBuilder amountPlaced=new StringBuilder();
            for(int i=0;i<betString.length();i++){
                if(Character.isAlphabetic(betString.charAt(i))){
                    hlf.append(betString.charAt(i));
                }
                if(Character.isDigit(betString.charAt(i))){
                    amountPlaced.append(betString.charAt(i));
                }
            }
            return new betOnHalf(mp.get(hlf.toString()),Integer.valueOf(amountPlaced.toString()));
        }
        System.out.println("invalid format...");
        return null;
    }
}
