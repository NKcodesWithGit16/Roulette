public class toupleStreamEvaluator {
    private StringToupleEvaluator[] stream;
    public toupleStreamEvaluator(StringToupleEvaluator[] stream){
        this.stream=stream;
    }
    public int totalPlaced(){
        int totalPlaced=0;
        for(int i=0;i<stream.length;i++){
            totalPlaced+=stream[i].getPlaced();
        }
        return totalPlaced;
    }
    public int totalWin(){
        int totalWin=0;
        for (int i = 0; i < stream.length; i++) {
            totalWin+=stream[i].winCount();
        }
        return totalWin;
    }
    public int profit(){
        return totalWin()-totalPlaced();
    }


}
