import java.util.*;
import java.io.*;

public class Coin{
    private int face = 1; //0 represent head, 1 represent tail
    private int num_flips = 5; //number of flips
    private int num_head = 0; //number of heads
    private int num_tail = 0; //number of tails
    private double head_prob = 0.5; //probability to get tail

    public void reset(){
        num_flips = 0;
    }

    public int getFace(){
        return face;
    }

    public int getNum_flips(){
        return num_flips;
    }
}
