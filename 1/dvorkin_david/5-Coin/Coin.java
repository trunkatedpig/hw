import java.io.*;
import java.util.*;

public class Coin {



    private Random prob = new Random();

    private int total;

    public int heads;

    private int percent = 50;

    private int tails;

    private int fairness;

    private String side;



    public void reset(){
        total = 0;
        heads = 0;
        tails = 0;
        fairness = 0;
    }

    public String flip(){
        if (prob.nextInt(100) < percent) {
            side = "Heads";
            heads+=1;
        }
        else
            {
                side = "Tails";
                tails+=1;
            }
        return side;

    }


    public String getSide(){
        return side;
    }
}