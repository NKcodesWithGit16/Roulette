package game;

import java.util.Random;

public class Board {

    private int randomNum;
    public Board(){
        randomNum=new Random().nextInt(37);
    }
    public int updateRandomNum(){
        int ran=new Random().nextInt(37);
        randomNum=ran;
        return ran;
    }

    public int getRandomNum() {
        return randomNum;
    }
}
