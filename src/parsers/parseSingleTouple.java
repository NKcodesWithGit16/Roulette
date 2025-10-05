package parsers;

import ToupleAndToupleStream.Touple;
import evaluators.StringToupleEvaluator;

public class parseSingleTouple {
    private String touple;
    public parseSingleTouple(String touple){
        this.touple=touple;
    }
    public Touple parse(){
        StringBuilder mystr=new StringBuilder();
        StringBuilder num=new StringBuilder();
        int i=1;
        while(i<touple.length()){
            if(touple.charAt(i)==','){
                i++;
                break;
            }
            mystr.append(touple.charAt(i));
            i++;
        }
        while(i<touple.length()){
            if(touple.charAt(i)==')'){
                break;
            }
            num.append(touple.charAt(i));
        }
        return new Touple(mystr.toString(),Integer.parseInt(num.toString()));
    }
}
