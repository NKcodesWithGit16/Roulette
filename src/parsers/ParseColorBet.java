package parsers;

import betAndbetStream.Enums.Color;
import betAndbetStream.Interface.Bet;
import betAndbetStream.betOnColor;

import java.util.HashMap;
import java.util.Map;

public class ParseColorBet implements parseBet{
    private String betString;
    public ParseColorBet(String betString){
        this.betString=betString;
    }
    public boolean isValidFormat(){
        return betString.matches("^\\((red|black|Green),\\s*[1-9]\\d*\\)$");
    }
    @Override
    public betOnColor parse(){
        Map<String,Color> mp = new HashMap<>() {{
            put("black",Color.black);
            put("red",Color.red);
            put("blue",Color.Green);
        }};
        if(isValidFormat()){
            StringBuilder col=new StringBuilder();
            StringBuilder amountPlaced=new StringBuilder();
            for(int i=0;i<betString.length();i++){
                if(Character.isAlphabetic(betString.charAt(i))){
                    col.append(betString.charAt(i));
                }
                if(Character.isDigit(betString.charAt(i))){
                    amountPlaced.append(betString.charAt(i));
                }
            }
            return new betOnColor(mp.get(col),Integer.valueOf(amountPlaced.toString()));

        }
        System.out.println("format is invalid...");
        return null;
    }
}
