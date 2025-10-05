public class StringToupleEvaluator {
    private String betsOn;
    private int price;
    private Board board;
    public StringToupleEvaluator(String betsOn, int price){
        this.betsOn=betsOn;
        this.price=price;
    }
    public String getBetsOn() {
        return betsOn;
    }
    public int getPrice() {
        return price;
    }
    public boolean isBetsOnNumeric(){
        for(int i=0;i<betsOn.length();i++){
            if(!Character.isDigit(betsOn.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public int winCount(){
        if(betsOn=="even"&&board.getRandomNum()%2==0&&board.getRandomNum()!=0||(betsOn=="odd"&&board.getRandomNum()%2==1)){
                return 2*price;
        }
        else if(betsOn=="red"&&board.getRouletteColors()[board.getRandomNum()]=="red"||betsOn=="black"&&board.getRouletteColors()[board.getRandomNum()]=="black"){
            return 2*price;
        }
        else if(isBetsOnNumeric()&&Integer.parseInt(betsOn)==board.getRandomNum()){
            return 36*price;
        }
        else{
            return 0;
        }
    }
}
