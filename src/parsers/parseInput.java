package parsers;

import ToupleAndToupleStream.Touple;
import ToupleAndToupleStream.ToupleStream;

import java.util.ArrayList;

public class parseInput {
    private String st;
    public parseInput(String st){
        this.st=st;
    }
    public ToupleStream parse(){
        StringBuilder str=new StringBuilder();
        ArrayList<Touple> lst=new ArrayList<>();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==','){
                lst.add(new parseSingleTouple(str.toString()).parse());
                str=new StringBuilder();
                continue;
            }
            str.append(st.charAt(i));
        }
        lst.add(new parseSingleTouple(str.toString()).parse());
        return new ToupleStream(lst);

    }

}
