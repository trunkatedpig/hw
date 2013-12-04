import java.io.*;
import java.util.*;

public class Coin{
    private String face;
    private int chance;
    private int flips;
    private int heads;
    private int tails;
    private int value;
    private String name;

    public Coin(int v){
	value = v;
	if (v == 1){
	    name = "Penny";}
	else if (v == 5){
	    name = "Nickel";}
	else if (v == 10){
	    name = "Dime";}
	else if (v == 25){
	    name = "Quarter";}
	else;
		name = "Unknown coin";
    }

    public String nameCoin(){
	return name;
    }
    public void setFace(String input){
	face=input;
    }
    public String getFace(){
	return face;
    }
    public void setUp(){
	flips=0;
	heads=0;
	tails=0;
	chance=50;
    }
    public void addFlips(){
	flips=flips+1;
    }

    public Coin(){
	setUp();
    }
    public int getValue(){
	return value;
    }
}