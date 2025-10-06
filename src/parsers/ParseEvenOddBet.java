package parsers;

import betAndbetStream.Enums.EvenOdd;
import betAndbetStream.Enums.Half;
import betAndbetStream.Interface.Bet;
import betAndbetStream.betOnEvenOdd;
import betAndbetStream.betOnHalf;

import java.util.HashMap;
import java.util.Map;

import static betAndbetStream.Enums.EvenOdd.even;
import static betAndbetStream.Enums.EvenOdd.odd;
import static betAndbetStream.Enums.Half.first;
import static betAndbetStream.Enums.Half.second;

public class ParseEvenOddBet implements parseBet{
    private String betString;
    public ParseEvenOddBet(String betString){
        this.betString=betString;
    }
    @Override
    public boolean isValidFormat() {
        return betString.matches("^\\((even|odd),\\s*[1-9]\\d*\\)$");
    }

    @Override
    public betOnEvenOdd parse() {
        if(isValidFormat()){
            Map<String,EvenOdd> mp=new HashMap<>(){{
                put("even",even);
                put("odd",odd);
            }};
            StringBuilder evnodd=new StringBuilder();
            StringBuilder amountPlaced=new StringBuilder();
            for(int i=0;i<betString.length();i++){
                if(Character.isAlphabetic(betString.charAt(i))){
                    evnodd.append(betString.charAt(i));
                }
                if(Character.isDigit(betString.charAt(i))){
                    amountPlaced.append(betString.charAt(i));
                }
            }
            return new betOnEvenOdd(mp.get(evnodd.toString()),Integer.valueOf(amountPlaced.toString()));
        }
        System.out.println("invalid format...");
        return null;
    }
}
