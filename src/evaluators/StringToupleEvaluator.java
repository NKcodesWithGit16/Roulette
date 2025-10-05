package evaluators;
import ToupleAndToupleStream.Touple;
import game.Board;

public class StringToupleEvaluator {
    private Touple tpl;
    private Board board;
    public StringToupleEvaluator(Touple tpl, Board board){
        this.tpl=tpl;
        this.board=board;
    }
    public int getTplPlaced() {
        return tpl.getPlaced();
    }
    public boolean isBetsOnNumeric(){
        for(int i=0;i<tpl.getBetsOn().length();i++){
            if(!Character.isDigit(tpl.getBetsOn().charAt(i))){
                return false;
            }
        }
        return true;
    }
    public int winCount(){
        if(tpl.getBetsOn()=="even"&&board.getRandomNum()%2==0&&board.getRandomNum()!=0||(tpl.getBetsOn()=="odd"&&board.getRandomNum()%2==1)){
                return 2*tpl.getPlaced();
        }
        else if(tpl.getBetsOn()=="red"&&board.getRouletteColors()[board.getRandomNum()]=="red"||tpl.getBetsOn()=="black"&&board.getRouletteColors()[board.getRandomNum()]=="black"){
            return 2*tpl.getPlaced();
        }
        else if(isBetsOnNumeric()&&Integer.parseInt(tpl.getBetsOn())==board.getRandomNum()){
            return 36*tpl.getPlaced();
        }
        else{
            return 0;
        }
    }
}
