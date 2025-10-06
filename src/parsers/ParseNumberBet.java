package parsers;

import betAndbetStream.betOnNumber;

public class ParseNumberBet implements parseBet{
    private String betString;
    public  ParseNumberBet(String betString){
        this.betString=betString;
    }
    @Override
    public boolean isValidFormat() {
        return betString.matches("^\\(((?:[0-9]|[1-2][0-9]|3[0-6])),\\s*[1-9]\\d*\\)$\n");
    }

    @Override
    public betOnNumber parse(){
        if(isValidFormat()){
            StringBuilder frst=new StringBuilder();
            StringBuilder scnd=new StringBuilder();
            boolean changed=false;
            for (int i=0;i<betString.length();i++) {
                if(!changed&&Character.isDigit(betString.charAt(i))){
                    frst.append(betString.charAt(i));
                }
                if(betString.charAt(i)==','){
                    changed=!changed;
                }

                if(changed&&Character.isDigit(betString.charAt(i))){
                    scnd.append(betString.charAt(i));
                }
            }
            return new betOnNumber(Integer.parseInt(frst.toString()),Integer.parseInt(scnd.toString()));

        }
        System.out.println("invalid format....");
        return null;
    }
}
