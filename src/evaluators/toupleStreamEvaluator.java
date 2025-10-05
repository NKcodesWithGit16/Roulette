package evaluators;

import ToupleAndToupleStream.Touple;
import evaluators.StringToupleEvaluator;

import java.util.ArrayList;

public class toupleStreamEvaluator {
    private ArrayList<StringToupleEvaluator> stream;
    public toupleStreamEvaluator(ArrayList<StringToupleEvaluator> stream){
        this.stream=stream;
    }
    public int totalPlaced(){
        int totalPlaced=0;
        for(int i=0;i<stream.size();i++){
            totalPlaced+=stream.get(i).getTplPlaced();
        }
        return totalPlaced;
    }
    public int totalWin(){
        int totalWin=0;
        for (int i = 0; i<stream.size(); i++) {
            totalWin+=stream.get(i).winCount();
        }
        return totalWin;
    }
    public int profit(){
        return totalWin()-totalPlaced();
    }


}
