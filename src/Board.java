import java.util.Random;
import java.util.random.RandomGenerator;

public class Board {
    private String[] rouletteColors;
    public Board(){
        rouletteColors=new String[]{
                "green", // 0
                "red",   // 1
                "black", // 2
                "red",   // 3
                "black", // 4
                "red",   // 5
                "black", // 6
                "red",   // 7
                "black", // 8
                "red",   // 9
                "black", // 10
                "black", // 11
                "red",   // 12
                "black", // 13
                "red",   // 14
                "black", // 15
                "red",   // 16
                "black", // 17
                "red",   // 18
                "red",   // 19
                "black", // 20
                "red",   // 21
                "black", // 22
                "red",   // 23
                "black", // 24
                "red",   // 25
                "black", // 26
                "red",   // 27
                "black", // 28
                "black", // 29
                "red",   // 30
                "black", // 31
                "red",   // 32
                "black", // 33
                "red",   // 34
                "black", // 35
                "red"   // 36
        };
    }
    public int getNextRandomNum(){
        return new Random().nextInt(37);
    }

    public String[] getRouletteColors() {
        return rouletteColors;
    }
}
