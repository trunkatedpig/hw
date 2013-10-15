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

    private int value;

    private String name;

    public Coin (){}

    public Coin(int value,String  name){
        this.value = value;
        this.name = name;
    }
    public Coin (int value){
        this.value = value;
        if (value == 1) name = "penny";
        if (value == 5) name = "nickel";
        if (value == 10) name = "dime";
        if (value == 25) name = "quarter";
    }
    public Coin (String name){
        this.name = name;
        if (name.equalsIgnoreCase("penny")) value = 1;
        if (name.equalsIgnoreCase("nickel")) value = 5;
        if (name.equalsIgnoreCase("dime")) value = 10;
        if (name.equalsIgnoreCase("quarter")) value = 25;
    }


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

    public String getName(){
        return name;
    }
    public int getValue(){
        return value;
    }
}