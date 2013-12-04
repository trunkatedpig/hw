import java.io.*;
import java.util.*;

public class Coin{
    private String face;
    private int chance;
    private int flips;
    private int heads;
    private int tails;

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
}